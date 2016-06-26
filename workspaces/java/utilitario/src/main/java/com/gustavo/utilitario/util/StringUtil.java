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
	 * @param source
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
	 * @param cadena
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
		if (cadena == null) {
			return cadena;
		}
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
	 * Ejm: StringUtil.capitalizeAllWords("hola mundo") == "Hola Mundo"
	 * StringUtil.capitalizeAllWords(" java wOrld") == " Java World"
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena de entrada
	 * @return String con palabras internas aplicadas capitalize
	 */
	public static String capitalizeAllWords(String cadena) {
		if (cadena == null) {
			return cadena;
		}
		boolean esInicioDePalabra = true;
		String resultado = "";
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);

			char caracterTransformado = esInicioDePalabra ? Character.toUpperCase(caracterActual)
					: Character.toLowerCase(caracterActual);

			boolean esEspacioEnBlanco = Character.isWhitespace(caracterActual);
			esInicioDePalabra = esEspacioEnBlanco;

			resultado += caracterTransformado;
		}
		return resultado;
	}

	/**
	 * 
	 * Dada una cadena remueve todos los espacios en blanco redundantes (más de
	 * un espacio se convierte en solo un espacio) dentro de la cadena, además
	 * remueve los espacios en blanco a los extremos de la cadena.
	 *
	 * @since 1.2
	 * @param cadena:
	 *            Cadena a ser procesada
	 * @return cadena con caracteres en blanco de los extremos removidos y
	 *         espacios en blanco redundantes internos convertidos a solo un
	 *         espacio.
	 */
	public static String fullTrim(String cadena) {
		if (cadena == null) {
			return cadena;
		}
		String cadenaFinal = "";
		cadena = cadena.trim();
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);
			if (i == 0) {
				cadenaFinal += caracterActual;
				continue;
			}
			char caracterAnterior = cadena.charAt(i - 1);
			boolean eresEspacio = Character.isWhitespace(caracterActual);
			boolean anteriorFueEspacio = Character.isWhitespace(caracterAnterior);
			if (!(eresEspacio && anteriorFueEspacio)) {
				cadenaFinal += caracterActual;
			}
		}
		return cadenaFinal;
	}

	/**
	 * 
	 * Convierte en mayusculas los caracteres de la cadena que esten en
	 * minusculas y viceversa.
	 *
	 * @since 1.2
	 * @param cadena
	 *            Cadena a aplicar swapCase
	 * @return cadena transformada
	 */
	public static String swapCase(String cadena) {
		if (cadena == null) {
			return cadena;
		}
		String cadenaFinal = "";
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);
			char caracterTransformado;
			if (Character.isUpperCase(caracterActual)) {
				caracterTransformado = Character.toLowerCase(caracterActual);
			} else {
				caracterTransformado = Character.toUpperCase(caracterActual);
			}
			cadenaFinal += caracterTransformado;
		}
		return cadenaFinal;
	}

}