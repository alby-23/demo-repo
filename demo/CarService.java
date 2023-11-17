package com.example.demo;

public class CarService {
    private CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;

    public CarService(CarDAO carDAO , EmailService emailService , MOTService motService) {
        this.carDAO = new CarDAO();
        this.emailService = new EmailService();
        this.motService = new MOTService(emailService);
    }
}
