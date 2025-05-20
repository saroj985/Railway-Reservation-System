package com.example.Railway_Reservation_System.service;

import com.example.Railway_Reservation_System.dto.PassengerDTO;
import com.example.Railway_Reservation_System.entity.General;
import com.example.Railway_Reservation_System.entity.Passenger;
import com.example.Railway_Reservation_System.entity.PhysicallyHandicapped;
import com.example.Railway_Reservation_System.entity.SeniorCitizen;
import com.example.Railway_Reservation_System.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;
    private Scanner scanner=new Scanner(System.in);


    @Override
    public String createPassengers(PassengerDTO passengerDTO) {
        Passenger passenger =null;

        if(passengerDTO.getPassengerType().equals("General")){
            try{
                passenger = new General();
                ((General) passenger).setCoach_type(passengerDTO.getCoachType());
            } catch (ClassCastException e) {
                System.out.println("Error creating General passenger: " + e.getMessage());
            }
            System.out.println(passenger);
        } else if  (passengerDTO.getPassengerType().equals("SeniorCitizen")) {
            passenger = new SeniorCitizen();
            ((SeniorCitizen) passenger).setDiscount(passengerDTO.getDiscount());
            ((SeniorCitizen) passenger).setSenior_citizen_id(Integer.valueOf(passengerDTO.getSeniorCitizenId()));
            System.out.println(passenger);
        } else if (passengerDTO.getPassengerType().equals("PhysicallyHandicapped")) {
            passenger = new PhysicallyHandicapped();
            ((PhysicallyHandicapped) passenger).setProof_of_disability(passengerDTO.getProofOfDisability());
            System.out.println(passenger);
        } else {
            return "Invalid Passenger Type";
        }
        if(passenger != null) {
            fillGeneralInfo(passenger, passengerDTO);
        }else{
            System.out.println("Process failed");
        }
        passengerRepository.save(passenger);
        return "Passenger created successfully.";
    }

    private void fillGeneralInfo(Passenger passenger, PassengerDTO passengerDTO) {
        passenger.setName(passengerDTO.getName());
        passenger.setEmail(passengerDTO.getEmail());
        passenger.setMobile(passengerDTO.getMobile());
        passenger.setDestination(passengerDTO.getDestination());
        passenger.setSeat_number(passengerDTO.getSeatNumber());
    }



    private void createPhysicallyHandicappedPassengers() {
        for(int i=0;i<1;i++) {
            PhysicallyHandicapped passenger = new PhysicallyHandicapped();
            System.out.println("Physically Handicapped Passenger " + (i + 1));
            fillCommonPassengerDetails(passenger);
            passengerRepository.save(passenger);
            System.out.println("Enter Proof of Disability: ");
            passenger.setProof_of_disability(scanner.next());
            passengerRepository.save(passenger);
        }
    }

    private void createSeniorCitizen() {
        for(int i=0;i<1;i++) {
            SeniorCitizen passenger = new SeniorCitizen();
            System.out.println("Senior Citizen Passenger " + (i + 1));
            fillCommonPassengerDetails(passenger);
            passengerRepository.save(passenger);
            System.out.println("Enter Discount: ");
            passenger.setDiscount(scanner.nextDouble());
            System.out.println("Enter Senior Citizen ID: ");
            passenger.setSenior_citizen_id(scanner.nextInt());
            passengerRepository.save(passenger);
        }
    }

    private void createGeneralPassengers() {
        for(int i=0;i<1;i++) {
            General passenger = new General();
            System.out.println("General Passenger " + (i + 1));
            fillCommonPassengerDetails(passenger);
            passengerRepository.save(passenger);
            System.out.println("Enter Coach Type: ");
            passenger.setCoach_type(scanner.next());
            passengerRepository.save(passenger);
        }
    }

    private void fillCommonPassengerDetails(Passenger passenger) {
        System.out.println("Enter Name: ");
        passenger.setName(scanner.next());
        System.out.println("Enter Email: ");
        passenger.setEmail(scanner.next());
        System.out.println("Enter Mobile: ");
        passenger.setMobile(scanner.nextLong());
        System.out.println("Enter Destination: ");
        passenger.setDestination(scanner.next());
        System.out.println("Enter Seat Number: ");
        passenger.setSeat_number(scanner.nextInt());
    }



    @Override
    public List<PhysicallyHandicapped> displayPhysicallyHandicappedPassengers() {
        List<PhysicallyHandicapped> physicallyHandicappedPassengers = passengerRepository.findAllPhysicallyHandicappedPassengers();
        for (PhysicallyHandicapped physicallyHandicappedPassenger : physicallyHandicappedPassengers) {
            System.out.println(physicallyHandicappedPassenger);
        }
        return physicallyHandicappedPassengers;
    }

}
