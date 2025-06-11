package com.Kalschatzi.springbootapp.repository;

import com.Kalschatzi.springbootapp.model.FlightPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightPositionRepo extends JpaRepository<FlightPosition, Long> {
    List<FlightPosition> findByCallsign(String callsign);
    List<FlightPosition> findByIcao24(String icao24);
}
