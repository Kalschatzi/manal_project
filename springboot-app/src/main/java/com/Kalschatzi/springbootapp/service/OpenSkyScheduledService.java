package com.Kalschatzi.springbootapp.service;


import com.Kalschatzi.springbootapp.model.Flight;
import com.Kalschatzi.springbootapp.model.FlightPosition;
import com.Kalschatzi.springbootapp.repository.FlightPositionRepo;
import com.Kalschatzi.springbootapp.repository.FlightRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
@RequiredArgsConstructor
public class OpenSkyScheduledService {

    private final FlightRepo flightRepo;
    private final FlightPositionRepo flightPositionRepo;

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    private static final String OPEN_SKY_API_URL = "https://opensky-network.org/api/states/all";

    @Scheduled(fixedRate = 30000) // every 30 seconds
    public void fetchAndSaveFlights() throws JsonProcessingException {
        String response = restTemplate.getForObject(OPEN_SKY_API_URL, String.class);
        JsonNode root = objectMapper.readTree(response);
        JsonNode states = root.path("states");

        // simple logging for monitoring purposes
        System.out.println("Fetching flight data...");

        if (states.isArray()){
            for (JsonNode flightData : states){
                // Flight data array fields (from OpenSky)
                // 0: icao24
                // 1: callsign
                // 2: origin_country
                // 3: time_position
                // 4: last_contact
                // 5: longitude
                // 6: latitude
                // 7: baro_altitude

                String icao24 = flightData.get(0).asText();
                String callsign = flightData.get(1).asText().trim();
                String originCountry = flightData.get(2).asText();
                long lastContact = flightData.get(4).asLong();
                double longitude = flightData.get(5).asDouble();
                double latitude = flightData.get(6).asDouble();
                double baroAltitude = flightData.get(7).asDouble();

                // filter out empty callsigns
                if (callsign.isEmpty()){
                    continue;
                }

                LocalDateTime timestamp = LocalDateTime.ofInstant(
                        Instant.ofEpochSecond(lastContact), ZoneId.systemDefault());

                // find existing flight or create new one
                Flight flight = flightRepo.findByIcao24(icao24)
                        .orElseGet(() -> {
                            Flight f = new Flight();
                            f.setCallsign(callsign);
                            f.setIcao24(icao24);
                            f.setOriginCountry(originCountry);
                            return flightRepo.save(f); // save new flight
                        });

                // create position object
                FlightPosition position = new FlightPosition();
//                position.setFlight(flight);
                position.setIcao24(icao24);
                position.setCallsign(callsign);
                position.setLatitude(latitude);
                position.setLongitude(longitude);
                position.setBaroAltitude(baroAltitude);
                position.setTimestamp(timestamp);

                flightPositionRepo.save(position);

                // simple logging for monitoring purposes
                System.out.println("Saved flight position for callsign: " + callsign);
            }
        }
    }
}
