package com.projeto.mercado;

public class Item {
	private String nome;
	private double valor;
	private String marca;
	
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
	public String getMarca() {
		return marca;
	}
	public void inserir(String nome, double valor, String marca) {
		this.nome = nome;
		this.valor = valor;
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + " marca: " + marca + " valor: " + valor;
	}
}
