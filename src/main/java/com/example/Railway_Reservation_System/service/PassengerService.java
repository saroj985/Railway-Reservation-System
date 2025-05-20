package com.example.Railway_Reservation_System.service;

import com.example.Railway_Reservation_System.dto.PassengerDTO;
import com.example.Railway_Reservation_System.entity.PhysicallyHandicapped;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PassengerService {
    String createPassengers(PassengerDTO passengerDTO);
    List<PhysicallyHandicapped> displayPhysicallyHandicappedPassengers();
}
