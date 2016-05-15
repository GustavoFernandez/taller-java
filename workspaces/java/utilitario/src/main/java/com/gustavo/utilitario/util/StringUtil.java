package com.gustavo.utilitario.util;

public class StringUtil {

	public static String capitalize(String source) {
		String primerCaracter = source.substring(0, 1);
		String demasCaracteres = source.substring(1);
		primerCaracter = primerCaracter.toUpperCase();
		demasCaracteres = demasCaracteres.toLowerCase();
		return primerCaracter + demasCaracteres;
	}
	
}
