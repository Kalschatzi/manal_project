package com.Kalschatzi.springbootapp.controller;

import com.Kalschatzi.springbootapp.service.FlightPositionService;
import com.Kalschatzi.springbootapp.model.FlightPosition;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/states/flight-position")
@Validated
public class FlightPositionController {
    private final FlightPositionService flightPositionService;

    @GetMapping("/")
    public ResponseEntity<List<FlightPosition>> getAllPositions(){
        return ResponseEntity.ok().body(flightPositionService.getAllPositions());
    }

    @GetMapping("/icao24/{icao24}")
    public ResponseEntity<List<FlightPosition>> getFlightByIcao24(@PathVariable String icao24){
        return ResponseEntity.ok().body(flightPositionService.getPositionByIcao24(icao24));
    }

}
