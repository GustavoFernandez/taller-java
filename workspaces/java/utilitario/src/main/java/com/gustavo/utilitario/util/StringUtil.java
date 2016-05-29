package com.gustavo.utilitario.util;

/**
 * Clase con metodos complementarios para manejo de Strings
 * 
 * @see java.lang.String
 * @author Gustavo Fernandez
 * @since 1.0
 */
public class StringUtil {

	/**
	 * 
	 * Retorna una cadena con el primer caracter en mayuscula y los demás
	 * caracteres en minuscula.
	 * <br>
	 * Ejemplo: "juan".capitalize() : "Juan"
	 * 
	 * @since 1.0
	 * @param source:
	 *            cadena que se le aplicará el capitalize
	 * @return Cadena que le aplico capitalize
	 */
	public static String capitalize(String source) {
		String primerCaracter = source.substring(0, 1);
		String demasCaracteres = source.substring(1);
		primerCaracter = primerCaracter.toUpperCase();
		demasCaracteres = demasCaracteres.toLowerCase();
		return primerCaracter + demasCaracteres;
	}

	/**
	 * 
	 * Trunca una cadena a un máximo de caracteres
	 * 
	 * @since 1.1
	 * @param cadena:
	 *            cadena a truncar
	 * @param maximoCaracteres:
	 *            número máximo de caracteres de la nueva cadena
	 * @return cadena truncada
	 */
	public static String truncate(String cadena, int maximoCaracteres) {
		int tamanoCadena = cadena.length();
		if (tamanoCadena <= maximoCaracteres) {
			return cadena;
		}
		String cadenaCortada = cadena.substring(0, maximoCaracteres);
		return cadenaCortada;
	}

}
