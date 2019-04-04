package com.algaworks.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.algaworks.model.Truck;
import com.algaworks.model.Driver;
import com.algaworks.model.Insurance;

public class Drivers {

	private Map<String, Optional<Driver>> drivers = new HashMap<>();

	public Drivers() {
		
		final Insurance insurance = new Insurance("Partil - Do not cover fatal accidents", new BigDecimal("5000"));
		final Truck truck = new Truck("Mercedes Atron", Optional.ofNullable(insurance));
		
		final String driverNameOne = "Guilherme";
		final Optional<Driver> driverOne = Optional.of(new Driver(driverNameOne, 25, Optional.ofNullable(truck)));
		
		final String driverNameTwo = "Camilla";
		final Optional<Driver> driverTwo = Optional.of(new Driver(driverNameTwo, 40, Optional.ofNullable(null)));

		drivers.put(driverNameOne, driverOne);
		drivers.put(driverNameTwo, driverTwo);
	}

	public Optional<Driver> fetchByNome(final String name) {
		return drivers.get(name);
	}

}
