package com.example.Railway_Reservation_System.controller;

import com.example.Railway_Reservation_System.dto.PassengerDTO;
import com.example.Railway_Reservation_System.entity.PhysicallyHandicapped;
import com.example.Railway_Reservation_System.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @PostMapping("/createPassengers")
    public String createPassengers(@ModelAttribute PassengerDTO passengerDTO) {
        System.out.println("Passenger Type: " + passengerDTO);
        return passengerService.createPassengers(passengerDTO);
    }

    @GetMapping("/displayPhysicallyHandicappedPassengers")
    public List<PhysicallyHandicapped> displayPhysicallyHandicappedPassengers() {
        return passengerService.displayPhysicallyHandicappedPassengers();
    }
}