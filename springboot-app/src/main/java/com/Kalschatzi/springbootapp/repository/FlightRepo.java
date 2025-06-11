package com.Kalschatzi.springbootapp.repository;

import com.Kalschatzi.springbootapp.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlightRepo extends JpaRepository <Flight, Long>{
    Optional<Flight> findByIcao24(String icao24);
}
