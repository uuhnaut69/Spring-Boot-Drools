package com.uuhnaut69.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uuhnaut69.drools.models.Fare;
import com.uuhnaut69.drools.models.TaxiRide;
import com.uuhnaut69.drools.service.TaxiFareCalculatorService;

@RestController
public class TaxiFareController {

	@Autowired
	private TaxiFareCalculatorService service;

	@GetMapping("/charge")
	public Long getCharge(@RequestBody TaxiRide taxiRide) {
		Fare rideFare = new Fare();
		Long totalCharge = service.calculateFare(taxiRide, rideFare);
		return totalCharge;
	}

}
