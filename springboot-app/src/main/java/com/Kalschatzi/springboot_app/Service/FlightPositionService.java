package com.Kalschatzi.springboot_app.Service;

import com.Kalschatzi.springboot_app.Repository.FlightPositionRepo;
import com.Kalschatzi.springboot_app.model.FlightPosition;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FlightPositionService {

    private final FlightPositionRepo flightPositionRepo;

    public List<FlightPosition> getAllPositions(){
        return flightPositionRepo.findAll();
    }

    public List<FlightPosition> getPositionByIcao24(String icao24){
        return flightPositionRepo.findByIcao24(icao24);
    }
}
