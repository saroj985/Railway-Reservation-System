package com.example.Railway_Reservation_System.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Create the specialized passenger classes
@Entity
@DiscriminatorValue("SeniorCitizen")
@ToString(callSuper = true)
public class SeniorCitizen extends Passenger{
    private double discount;
    private Integer senior_citizen_id;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Integer getSenior_citizen_id() {
        return senior_citizen_id;
    }

    public void setSenior_citizen_id(Integer senior_citizen_id) {
        this.senior_citizen_id = senior_citizen_id;
    }

    @Override
    public String toString() {
        return "SeniorCitizen{" +
                "discount=" + discount +
                ", senior_citizen_id=" + senior_citizen_id +
                '}';
    }
}
