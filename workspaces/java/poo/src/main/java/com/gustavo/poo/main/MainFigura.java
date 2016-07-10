package com.gustavo.poo.main;

import com.gustavo.poo.bean.herencia.Circulo;
import com.gustavo.poo.bean.herencia.Rectangulo;

public class MainFigura {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(10, 5);
		rectangulo.setColor("YELLOW");
		System.out.println(rectangulo.toString());

		System.out.println();

		Circulo circulo = new Circulo(10);
		circulo.setColor("BLUE");
		System.out.println(circulo.toString());
	}
}
