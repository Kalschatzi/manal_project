package com.Kalschatzi.springboot_app.Repository;

import com.Kalschatzi.springboot_app.model.FlightPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightPositionRepo extends JpaRepository<FlightPosition, Long> {
    List<FlightPosition> findByIcao24(String icao24);
}
