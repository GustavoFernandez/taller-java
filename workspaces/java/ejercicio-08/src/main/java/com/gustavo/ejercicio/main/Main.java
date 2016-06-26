package com.gustavo.ejercicio.main;

import java.util.Scanner;
import static com.gustavo.utilitario.util.StringUtil.*;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int numeroAlumnos = 3;
		String[] nombres = new String[numeroAlumnos];
		int[] notas = new int[numeroAlumnos];

		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.println("Ingrese el nombre del alumno " + (i + 1));
			nombres[i] = capitalizeAllWords(fullTrim(lector.nextLine()));
			System.out.println("Ingrese la nota del alumno " + (i + 1));
			notas[i] = lector.nextInt();
			lector.nextLine();
		}

		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.format("El nombre del alumno 1 es %s y su nota es %d \n", nombres[i], notas[i]);
		}
		lector.close();
	}

}
