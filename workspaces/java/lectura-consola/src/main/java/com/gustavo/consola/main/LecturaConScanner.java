package com.gustavo.consola.main;

import java.util.Scanner;

public class LecturaConScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa tu nombre:");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese su apellido:");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese su edad:");
		int edad = scanner.nextInt();

		System.out.format("Su nombre es %s, su apellido es %s y tienes %d años\n", nombre, apellido, edad);

		scanner.close();
	}

}
