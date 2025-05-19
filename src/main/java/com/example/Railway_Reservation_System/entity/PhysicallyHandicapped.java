package com.example.Railway_Reservation_System.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
//Create the specialized passenger classes
@Entity
@DiscriminatorValue("PhysicallyHandicapped")
public class PhysicallyHandicapped extends Passenger{
    private String proof_of_disability;
}
