package com.gustavo.poo.bean;

public class Calculadora {

	private int resultado;

	public void sumar(int sumando1, int sumando2) {
		resultado = sumando1 + sumando2;
	}

	public void restar(int minuendo, int sustraendo) {
		resultado = minuendo - sustraendo;
	}

	public void multiplicar(int numero1, int numero2) {
		resultado = numero1 * numero2;
	}

	public void dividir(int numero1, int numero2) {
		resultado = numero1 / numero2;
	}

	public int getResultado() {
		return resultado;
	}

}
