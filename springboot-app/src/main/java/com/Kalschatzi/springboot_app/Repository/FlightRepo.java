package com.Kalschatzi.springboot_app.Repository;

import com.Kalschatzi.springboot_app.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlightRepo extends JpaRepository <Flight, String>{
    Optional<Flight> findByIcao24(String icao24);
}
