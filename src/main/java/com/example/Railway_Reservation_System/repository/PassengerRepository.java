package com.example.Railway_Reservation_System.repository;

import com.example.Railway_Reservation_System.entity.Passenger;
import com.example.Railway_Reservation_System.entity.PhysicallyHandicapped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
    @Query("SELECT p FROM PhysicallyHandicapped p")
    List<PhysicallyHandicapped> findAllPhysicallyHandicappedPassengers();
}
