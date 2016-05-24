package com.gustavo.utilitario.util;

public class StringUtil {

	public static String capitalize(String source) {
		String primerCaracter = source.substring(0, 1);
		String demasCaracteres = source.substring(1);
		primerCaracter = primerCaracter.toUpperCase();
		demasCaracteres = demasCaracteres.toLowerCase();
		return primerCaracter + demasCaracteres;
	}

	public static String truncate(String cadena, int maximoCaracteres) {
		int tamanoCadena = cadena.length();
		if (tamanoCadena <= maximoCaracteres) {
			return cadena;
		}
		String cadenaCortada = cadena.substring(0, maximoCaracteres);
		return cadenaCortada;
	}

}
