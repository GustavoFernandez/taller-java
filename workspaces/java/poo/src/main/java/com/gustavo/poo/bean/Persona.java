package com.gustavo.poo.bean;

import java.util.Arrays;

public class Persona {

	private String dni; // requerido
	private String nombre; // requerido
	private String apellido; // requerido
	private int posicion;
	private boolean esCasado;
	private double salario;

	public Persona(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/**
	 * Caminar x metros
	 * 
	 * @param metros
	 *            numero de metros que ha avanzado
	 */
	public void caminar(int metros) {
		posicion += metros;
	}

	/**
	 * 
	 * @param persona
	 *            persona a la que vas a cargar
	 * @param metros
	 *            numero de metros que lo cargaste
	 */
	public void cargar(Persona persona, int metros) {
		posicion += metros;
		persona.posicion += metros;
	}

	public static void cargar(Persona elQueCarga, Persona elCargado, int metros) {
		elQueCarga.posicion += metros;
		elCargado.posicion += metros;
	}

	public static void main(String[] args) {
		int[] arrreglo = new int[5];
		System.out.println(Arrays.toString(arrreglo));
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public boolean isEsCasado() {
		return esCasado;
	}

	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
