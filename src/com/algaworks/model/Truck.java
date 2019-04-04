package com.algaworks.model;

import java.util.Optional;

public class Truck {

	private String model;
	private Optional<Insurance> insurance;

	public Truck(String model, Optional<Insurance> insurance) {
		this.model = model;
		this.insurance = insurance;
	}

	public String getModel() {
		return model;
	}

	public void setModelo(String model) {
		this.model = model;
	}

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

}
