package com.example.Railway_Reservation_System.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
//Create the specialized passenger classes
@Entity
@DiscriminatorValue("SeniorCitizen")
public class SeniorCitizen extends Passenger{
    private double discount;
    private Integer senior_citizen_id;
}
