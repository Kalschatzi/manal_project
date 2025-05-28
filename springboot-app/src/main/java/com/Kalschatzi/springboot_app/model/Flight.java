package com.Kalschatzi.springboot_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "flight")
public class Flight {
    @Id
    private String icao24;
    private String callsign;
    private String originCountry;
}
