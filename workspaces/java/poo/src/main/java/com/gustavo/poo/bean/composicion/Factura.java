package com.gustavo.poo.bean.composicion;

import java.util.Date;

import com.gustavo.poo.bean.Persona;

public class Factura {

	public static final double IGV = 0.18;

	private Date fechaEmision;
	private String numeroFactura;
	private Item[] items;
	private Persona cliente;

	public Factura(Date fechaEmision, String numeroFactura, Item[] items, Persona cliente) {
		super();
		this.fechaEmision = fechaEmision;
		this.numeroFactura = numeroFactura;
		this.items = items;
		this.cliente = cliente;
	}

	public double calcularMontoTotal() {
		double montoTotal = 0.0;
		for (Item item : items) {
			montoTotal += item.calcularMontoParcial();

		}
		double montoIgv = montoTotal * IGV;
		return montoTotal + montoIgv;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

}
