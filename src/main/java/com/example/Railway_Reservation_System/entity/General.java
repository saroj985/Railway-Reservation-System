package com.example.Railway_Reservation_System.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
//Create the specialized passenger classes
@Entity
@DiscriminatorValue("General")
public class General extends Passenger {
    private String coach_type;
}
