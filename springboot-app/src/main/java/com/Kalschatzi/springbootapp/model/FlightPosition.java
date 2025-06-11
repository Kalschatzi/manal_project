package com.Kalschatzi.springbootapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "flight_position")
public class FlightPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private Flight flight;

    private String icao24; // Unique aircraft ID from OpenSky

    @Column(name = "callsign")
    private String callsign; // flight number
    private double latitude;
    private double longitude;

    @Column(name = "altitude")
    private double baroAltitude;

    private LocalDateTime timestamp;

}
