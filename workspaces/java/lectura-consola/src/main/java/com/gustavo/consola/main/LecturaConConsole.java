package com.gustavo.consola.main;

import java.io.Console;

public class LecturaConConsole {

	public static void main(String[] args) {
		Console console = System.console();

		if (console != null) {
			System.out.println("Ingresa tu nombre:");
			String nombre = console.readLine();

			System.out.println("Ingrese su apellido:");
			String apellido = console.readLine();

			System.out.println("Ingrese su edad:");
			int edad = Integer.parseInt(console.readLine());

			System.out.println("Ingrese su password:");
			char[] password = console.readPassword();
			String passwordStr = new String(password);

			System.out.format("Su nombre es %s, su apellido es %s y tienes %d a\u00F1os\n", nombre, apellido, edad);
			System.out.println("Su password es: " + passwordStr);
		} else {
			System.out.println("La aplicaci\u00F3n no pudo encontrar una consola.");
		}
	}

}