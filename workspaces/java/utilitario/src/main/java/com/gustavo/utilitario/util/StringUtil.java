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
	 * caracteres en minuscula. <br>
	 * Ejemplo: "juan".capitalize() : "Juan"
	 * 
	 * @since 1.0
	 * @param source:
	 *            cadena que se le aplicará el capitalize
	 * @return Cadena que le aplico capitalize
	 */
	public static String capitalize(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		}
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
		if (cadena == null) {
			return cadena;
		}
		int tamanoCadena = cadena.length();
		if (tamanoCadena <= maximoCaracteres) {
			return cadena;
		}
		String cadenaCortada = cadena.substring(0, maximoCaracteres);
		return cadenaCortada;
	}

	/**
	 * 
	 * Repite la cadena ingresada por parametro n veces
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena fuente
	 * @param times:
	 *            numero de veces a repetir
	 * @return cadena repetida n veces
	 */
	public static String times(String cadena, int times) {
		if (cadena == null) {
			return cadena;
		}
		String resultado = "";
		for (int i = 0; i < times; i++) {
			resultado += cadena;
		}
		return resultado;
	}

	/**
	 * 
	 * Invierte una cadena
	 *
	 * @since 1.2
	 * @param cadena:
	 *            cadena a invertir
	 * @return retorna la cadena invertida
	 */
	public static String reverse(String cadena) {
		String resultado = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		return resultado;
	}

	/**
	 * 
	 * Recibe una cadena como parametro y le aplica capitalize a cada palabra
	 * que tenga esa cadena. Una palabra es cada conjunto de caracteres
	 * separados por un espacio.
	 * 
	 * Ejm: StringUtil.capitalizeAllWords("hola mundo") -> "Hola Mundo"
	 * StringUtil.capitalizeAllWords(" java wOrld") -> " Java World"
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena de entrada
	 * @return String con palabras internas aplicadas capitalize
	 */
	public static String capitalizeAllWords(String cadena) {
		boolean esInicioDePalabra = true;
		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);

			char caracterTransformado = esInicioDePalabra
					? Character.toUpperCase(caracterActual)
					: Character.toLowerCase(caracterActual);

			boolean esEspacioEnBlanco = Character.isWhitespace(caracterActual);
			esInicioDePalabra = esEspacioEnBlanco;

			resultado += caracterTransformado;
		}
		return resultado;
	}
}
