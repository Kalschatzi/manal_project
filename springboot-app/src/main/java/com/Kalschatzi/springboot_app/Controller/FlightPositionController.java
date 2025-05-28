package com.Kalschatzi.springboot_app.Controller;

import com.Kalschatzi.springboot_app.Service.FlightPositionService;
import com.Kalschatzi.springboot_app.Service.FlightService;
import com.Kalschatzi.springboot_app.model.Flight;
import com.Kalschatzi.springboot_app.model.FlightPosition;
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
