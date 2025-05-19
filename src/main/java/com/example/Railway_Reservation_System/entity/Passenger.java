package com.example.Railway_Reservation_System.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
//Create the base Passenger entity
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "passenger_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passenger_id;
    private String name;
    private String email;
    private String mobile;
    private String destination;
    private Integer seat_number;
}
