package com.example.Railway_Reservation_System.dto;


public class PassengerDTO {
    private String passengerType;
    private String name;
    private String email;
    private Long mobile;
    private String destination;
    private Integer seatNumber;
    private String coachType;
    private Double discount;
    private String seniorCitizenId;
    private String proofOfDisability;


    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getSeniorCitizenId() {
        return seniorCitizenId;
    }

    public void setSeniorCitizenId(String seniorCitizenId) {
        this.seniorCitizenId = seniorCitizenId;
    }

    public String getProofOfDisability() {
        return proofOfDisability;
    }

    public void setProofOfDisability(String proofOfDisability) {
        this.proofOfDisability = proofOfDisability;
    }
}
