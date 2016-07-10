package com.gustavo.poo.main;

import java.util.Date;

import com.gustavo.poo.bean.Persona;
import com.gustavo.poo.bean.composicion.Factura;
import com.gustavo.poo.bean.composicion.Item;
import com.gustavo.poo.bean.composicion.Producto;

public class GenerarFactura {

	public static void main(String[] args) {
		Persona cliente = new Persona("12345678", "Pedro", "Navaja");

		Producto pepsi3Litros = new Producto("P001", "Pepsi 3L", 7.0);
		Producto cocaCola = new Producto("P002", "Coca cola 3L", 15.0);

		Item[] items = new Item[2];
		items[0] = new Item(pepsi3Litros, 3);
		items[1] = new Item(cocaCola, 2);

		Date fechaActual = new Date();

		Factura factura = new Factura(fechaActual, "12345", items, cliente);

		System.out.println("El monto total de la factura es: " + factura.calcularMontoTotal());
	}
}
