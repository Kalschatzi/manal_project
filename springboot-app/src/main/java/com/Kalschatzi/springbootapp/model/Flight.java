package com.Kalschatzi.springbootapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icao24; // Unique aircraft ID from OpenSky
    private String callsign; // flight number
    private String originCountry;
    private List<FlightPosition> positions;
}
