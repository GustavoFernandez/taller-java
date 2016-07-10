package com.gustavo.poo.bean.herencia;

public class Rectangulo extends Figura {

	private double largo;
	private double ancho;

	public Rectangulo(double largo, double ancho) {
		super();
		this.largo = largo;
		this.ancho = ancho;
	}

	@Override
	public double perimetro() {
		return 2 * (largo + ancho);
	}

	@Override
	public double area() {
		return largo * ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Rectangulo [largo=" + largo + ", ancho=" + ancho + ", perimetro()=" + perimetro() + ", area()=" + area()
				+ ", getColor()=" + getColor() + "]";
	}

}
