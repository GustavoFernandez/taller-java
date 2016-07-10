package com.gustavo.poo.main;

import com.gustavo.poo.bean.Persona;

public class MainPersona {

	public static void main(String[] args) {
		Persona juan = new Persona("12345678", "Juan", "Rosas");
		System.out.format("El DNI de %s es %s \n", juan.getNombre(), juan.getDni());

		Persona pedro = new Persona("87654321", "Pedro", "Arias");
		System.out.format("El DNI de %s es %s \n", pedro.getNombre(), pedro.getDni());

		juan.caminar(5);
		pedro.caminar(10);

		System.out.println("Juan esta en la posicion: " + juan.getPosicion());
		System.out.println("Pedro esta en la posicion: " + pedro.getPosicion());

		// juan.cargar(pedro, 5);
		Persona.cargar(juan, pedro, 5);

		System.out.println("Juan cargando a Pedro");
		System.out.println("Juan esta en la posicion: " + juan.getPosicion());
		System.out.println("Pedro esta en la posicion: " + pedro.getPosicion());

	}

}
