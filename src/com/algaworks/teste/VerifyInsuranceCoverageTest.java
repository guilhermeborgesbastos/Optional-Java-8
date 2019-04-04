package com.algaworks.teste;

import com.algaworks.model.Truck;
import com.algaworks.model.Driver;
import com.algaworks.model.Insurance;
import com.algaworks.repository.Drivers;

public class VerifyInsuranceCoverageTest {

	public static void main(String[] args) {
		
		Drivers drivers = new Drivers();
		
		/*
		 * Instead of this:
		Driver driver = drivers.fetchByNome("Guilherme");
		
		// String coverage = driver.getTruck().getInsurance().getCoverage();
		String coverage = "No Insurance";
		if (driver != null) {
			Truck truck = driver.getTruck();
			if (truck != null) {
				Insurance insurance = truck.getInsurance();
				if (insurance != null) {
					coverage = insurance.getCoverage();
				}
			}
		}
		*/
		
		// With optional is much clean
		String coverage = drivers.fetchByNome("Guilherme")
								.flatMap(Driver::getTruck)
								.flatMap(Truck::getInsurance)
								.map(Insurance::getCoverage)
								.orElse("Without insurance coverage");
		
		System.out.println("The coverage is: " + coverage);
	}
	
}















