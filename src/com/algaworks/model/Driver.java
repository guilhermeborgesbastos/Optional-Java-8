package com.algaworks.model;

import java.util.Optional;

public class Driver {

	private String name;
	private Integer age;
	private Optional<Truck> truck;

	public Driver(String name, Integer age, Optional<Truck> truck) {
		this.name = name;
		this.age = age;
		this.truck = truck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Optional<Truck> getTruck() {
		return truck;
	}

	public void setTruck(Optional<Truck> truck) {
		this.truck = truck;
	}

}
