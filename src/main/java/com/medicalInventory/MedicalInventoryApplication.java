package com.medicalInventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicalInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalInventoryApplication.class, args);
		
		System.out.println("Databace Connected...!");
	}

}
