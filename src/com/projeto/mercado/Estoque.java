package com.projeto.mercado;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private List<Item> itens;
	private Item item;

	public Estoque() {
		itens = new ArrayList<Item>();
	}

	public void cadastrarItemNoEstoque(String nome, double valor, String marca) {
		item = new Item();
		item.inserir(nome, valor, marca);
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return itens;
	}

	public int totalEstoque() {
		return itens.size();
	}
}
