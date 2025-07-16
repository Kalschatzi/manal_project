package com.Kalschatzi.springbootapp.controller;

import com.Kalschatzi.springbootapp.service.FlightService;
import com.Kalschatzi.springbootapp.model.Flight;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/flights")
@Validated
public class FlightController {
    private final FlightService flightService;

    @GetMapping("/")
    public ResponseEntity<List<Flight>> getAllFlights(){
        return ResponseEntity.ok().body(flightService.getAllFlights());
    }

    @GetMapping("/{icao24}")
    public ResponseEntity<Flight> getFlightByIcao24(@PathVariable String icao24){
        Flight flight = flightService.getFlightByIcao24(icao24);
        return ResponseEntity.ok(flight);
    }
}
