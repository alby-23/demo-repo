package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//dependecies
		CarDAO carDAO = new CarDAO();
		EmailService emailService = new EmailService();
		MOTService motService = new MOTService(emailService);

		//inject
		CarService carService = new CarService(carDAO , emailService , motService);

	}

}
