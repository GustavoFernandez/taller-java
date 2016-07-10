package com.gustavo.poo.interfaces;

// Interfaces son siempre abstract aun si no se especifica
public abstract interface NumberGenerator {

	// variables globales siempre son "public static final" aun si no se especifican
	public static final String VALOR = "Hola";

	default public int generate() {
		return (int) (Math.random() * 10);
	}

}
