package com.Kalschatzi.springboot_app.model;

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

    private String icao24; // Unique aircraft ID from OpenSky
    private String callsign;
    private float latitude;
    private float longitude;
    private float baroAltitude;
    private LocalDateTime timestamp;

}
