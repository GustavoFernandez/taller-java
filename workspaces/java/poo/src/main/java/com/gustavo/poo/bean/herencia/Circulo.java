package com.gustavo.poo.bean.herencia;

public class Circulo extends Figura {

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
