package com.example.spring.demo;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	/*
	 * Map de methode aan je endpoint. In dit geval mappen we de methode
	 * getCurrentDate() aan de GET endpoint /current-date
	 */
	@GetMapping("/current-date")
	public String getCurrentDate() {
		LocalDate localDate = LocalDate.now();
		return "Date: " + localDate;
	}
	
	
	/*
	 * Map de methode aan je endpoint. In dit geval mappen we de methode
	 * addName() aan de POST endpoint /welcome
	 * Met de @RequestBody wordt de HTTP content omgezet.
	 */
	@PostMapping("/welcome")
	public String addName(@RequestBody String name) {
		return "Welcome " + name + "!";
	}
}
