package com.farmacia.Farmacia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.farmacia.Farmacia.repository.CategoriaRepository;

@SpringBootApplication
public class FarmaciaApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(FarmaciaApplication.class, args);
		
		System.out.println("\n============================= Aplicação rodando======================\n");
		
	}
	
	
}