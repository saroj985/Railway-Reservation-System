package com.example.Railway_Reservation_System.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.ToString;

//Create the specialized passenger classes
@Entity
@DiscriminatorValue("General")
@ToString(callSuper = true)
public class General extends Passenger {
    private String coach_type;

    public String getCoach_type() {
        return coach_type;
    }

    public void setCoach_type(String coach_type) {
        this.coach_type = coach_type;
    }

    @Override
    public String toString() {
        return "General{" +
                "coach_type='" + coach_type + '\'' +
                '}';
    }
}
