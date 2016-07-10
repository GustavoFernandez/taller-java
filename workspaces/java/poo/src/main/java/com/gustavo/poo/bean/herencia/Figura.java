package com.gustavo.poo.bean.herencia;

public abstract class Figura {

	private String color;

	public abstract double perimetro();

	public abstract double area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "\n"
				+ "Perimetro: " + this.perimetro() + "\n"
				+ "Area: " + this.area() + "\n"
				+ "Color: " + this.getColor();
	}

}
