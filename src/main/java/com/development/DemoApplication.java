package com.development;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	// Define a JPA Entity for the application
	
	// Creates a repository to fetch all data
	
	// Define a CommandLineRunner to initialize the database
	
	// Define a RestController to expose the data
}
