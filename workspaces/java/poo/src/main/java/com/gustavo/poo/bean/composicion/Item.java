package com.gustavo.poo.bean.composicion;

public class Item {

	private Producto producto;
	private double cantidad;

	public Item(Producto producto, double cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public double calcularMontoParcial() {
		return this.producto.getPrecio() * this.cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
}
