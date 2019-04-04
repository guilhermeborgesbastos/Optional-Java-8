package com.algaworks.teste;

import java.math.BigDecimal;
import java.util.Optional;

import com.algaworks.model.Insurance;

public class TesteOptional {

	public static void main(String[] args) {
		Insurance insurance = new Insurance("Reduced franchise total", new BigDecimal("600"));
		Optional<Insurance> insuranceOptional = Optional.ofNullable(insurance);

		insuranceOptional.map(Insurance::getInsuranceValue).ifPresent(System.out::println);
	}
	
}
