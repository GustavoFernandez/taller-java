package com.gustavo.ejercicio.main;

import static com.gustavo.utilitario.util.StringUtil.capitalizeAllWords;
import static com.gustavo.utilitario.util.StringUtil.fullTrim;

import java.util.Arrays;
import java.util.Scanner;

import com.gustavo.ejercicio.bean.Alumno;

public class MainPOO {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		Alumno[] alumnos = new Alumno[3];

		System.out.println("> alumnos: " + Arrays.toString(alumnos));

		for (int i = 0; i < alumnos.length; i++) {
			Alumno nuevoAlumno = new Alumno();
			System.out.println("Ingrese el nombre del alumno " + (i + 1));
			nuevoAlumno.setNombre(capitalizeAllWords(fullTrim(lector.nextLine())));
			System.out.println("Ingrese la nota del alumno " + (i + 1));
			nuevoAlumno.setNota(lector.nextInt());
			lector.nextLine();
			System.out.println("> se va a agregar el alumno: "
					+ nuevoAlumno.getNombre()
					+ ", " + nuevoAlumno.getNota());
			alumnos[i] = nuevoAlumno;
			System.out.println("> nuevoAlumno agregado en el indice " + i);
		}
		
		System.out.println("> alumnos: " + Arrays.toString(alumnos));

		for (Alumno alumno : alumnos) {
			alumno.mostrarDatos();
		}
		lector.close();
	}

}
