package com.gustavo.poo.interfaces;

public class PruebaGenerator {
	public static void main(String[] args) {

		NumberGenerator generador;

		System.out.println("Generador pares ....");
		generador = new ParNumberGenereator();
		System.out.println(generador.getClass().getCanonicalName());
		for (int i = 0; i < 10; i++) {
			System.out.println(generador.generate());
		}
		System.out.println("===============================");

		System.out.println("Generador impares ....");
		generador = new ImparNumberGenerator();
		System.out.println(generador.getClass().getCanonicalName());
		for (int i = 0; i < 10; i++) {
			System.out.println(generador.generate());
		}
		System.out.println("===============================");

		System.out.println("Generador numeros aleatorios ....");
		generador = new CualquierNumberGenerator();
		System.out.println(generador.getClass().getCanonicalName());
		for (int i = 0; i < 10; i++) {
			System.out.println(generador.generate());
		}
		System.out.println("===============================");
	}
}
