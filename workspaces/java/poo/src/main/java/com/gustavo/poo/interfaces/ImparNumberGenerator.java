package com.gustavo.poo.interfaces;

public class ImparNumberGenerator implements NumberGenerator {

	@Override
	public int generate() {
		int numeroGenereso = (int) (Math.random() * 10);
		return (numeroGenereso * 2) + 1;
	}

}
