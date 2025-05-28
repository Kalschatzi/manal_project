package com.Kalschatzi.springbootapp.service;
import com.Kalschatzi.springbootapp.repository.FlightRepo;
import com.Kalschatzi.springbootapp.model.Flight;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class FlightService{

    private final FlightRepo flightRepo;


    public List<Flight> getAllFlights(){
        return flightRepo.findAll();
    }

    public Flight getFlightByIcao24(String icao24) {
        Optional<Flight> optionalFlight = flightRepo.findByIcao24(icao24);
        if (optionalFlight.isPresent()){
            return optionalFlight.get();
        } else {
            log.info("Flight with Icao24: {} doesn't exist. icao24");
            return null;
        }
    }


}
