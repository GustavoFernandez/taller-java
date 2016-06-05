package com.gustavo.ejercicio01.test;

import static com.gustavo.utilitario.util.StringUtil.*;

public class PruebaTimes {

	public static void main(String[] args) {
		System.out.println(times("*", 4));
		System.out.println(times("java", 2));
		System.out.println(times("hola ", 3));
		
		String cadena = capitalize("");
		System.out.println(cadena);
	}
	
}
