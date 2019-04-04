package com.algaworks.model;

import java.math.BigDecimal;

public class Insurance {

	private String coverage;
	private BigDecimal insuranceValue;

	public Insurance(String coverage, BigDecimal insuranceValue) {
		this.coverage = coverage;
		this.insuranceValue = insuranceValue;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public BigDecimal getInsuranceValue() {
		return insuranceValue;
	}

	public void setInsuranceValue(BigDecimal insuranceValue) {
		this.insuranceValue = insuranceValue;
	}

}
