package com.gustavo.ejercicio.main;

import java.util.Scanner;
import static com.gustavo.utilitario.util.StringUtil.*;

public class CalcularPromedio {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		String nombreAlumno = "";
		int[] notas = new int[3];

		System.out.println("Ingrese el nombre del alumno:");
		nombreAlumno = lector.nextLine();
		System.out.println("Ingrese la nota 1 del alumno:");
		notas[0] = lector.nextInt();
		System.out.println("Ingrese la nota 2 del alumno:");
		notas[1] = lector.nextInt();
		System.out.println("Ingrese la nota 3 del alumno:");
		notas[2] = lector.nextInt();

		double promedioFinal = calcularPromedio(notas);
		String estado = promedioFinal > 10.0 ? "Aprobado" : "Reprobado";
		nombreAlumno = capitalizeAllWords(fullTrim(nombreAlumno));

		System.out.format("El nombre del alumno es %s y su promedio" + " final es %.2f, el alumno ha %s.", nombreAlumno,
				promedioFinal, estado);

		lector.close();
	}

	public static double calcularPromedio(int[] notas) {
		double sumaNotas = 0.0;
		for (int nota : notas) {
			sumaNotas += nota;
		}
		return sumaNotas / notas.length;
	}

}
