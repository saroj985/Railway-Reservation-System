package com.example.Railway_Reservation_System.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.ToString;


//Create the specialized passenger classes
@Entity
@DiscriminatorValue("PhysicallyHandicapped")
@ToString(callSuper = true)
public class PhysicallyHandicapped extends Passenger{
    private String proof_of_disability;

    public String getProof_of_disability() {
        return proof_of_disability;
    }

    public void setProof_of_disability(String proof_of_disability) {
        this.proof_of_disability = proof_of_disability;
    }

    @Override
    public String toString() {
        return "PhysicallyHandicapped{" +
                "proof_of_disability='" + proof_of_disability + '\'' +
                '}';
    }

    public PhysicallyHandicapped(String proof_of_disability) {
        this.proof_of_disability = proof_of_disability;
    }
    public PhysicallyHandicapped() {
    }


}
