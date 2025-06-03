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
@Table(name = "flight_positions")
public class FlightPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // many flight positions belong to one flight
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flight_id") //foreign key in flight_positions table
    private Flight flight;

    private String icao24; // Unique aircraft ID from OpenSky
    private String callsign; // flight number
    private float latitude;
    private float longitude;
    private float baroAltitude;
    private LocalDateTime timestamp;

}
