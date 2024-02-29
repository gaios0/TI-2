package com.ti2cc;

public class X {
	private int assentos;
	private String marca;
	private String distribuidora;
	private char simbolo;
	
	public X() {
		this.assentos = -1;
		this.marca = "";
		this.distribuidora = "";
		this.simbolo = '*';
	}
	
	public X(int assentos, String marca, String distribuidora, char simbolo) {
		this.assentos = assentos;
		this.marca = marca;
		this.distribuidora = distribuidora;
		this.simbolo = simbolo;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public String toString() {
		return "Carro [assentos=" + assentos + ", marca=" + marca + ", distribuidora=" + distribuidora + ", simbolo=" + simbolo + "]";
	}	
}
