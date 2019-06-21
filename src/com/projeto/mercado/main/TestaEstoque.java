package com.projeto.mercado.main;

import com.projeto.mercado.Estoque;

public class TestaEstoque {
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		
		estoque.cadastrarItemNoEstoque("bolacha", 1.5, "Adria");
		estoque.cadastrarItemNoEstoque("bolacha", 1.7, "Parmalat");
		estoque.cadastrarItemNoEstoque("bolacha", 2.8, "Negresco");
		estoque.cadastrarItemNoEstoque("bolacha", 2.5, "Bonno");
		estoque.cadastrarItemNoEstoque("refrigerante", 1.5, "Coca-cola");
		
		
		for (int i = 0; i < estoque.totalEstoque(); i++) {
			System.out.println(estoque.getItens().get(i));
		}
	}
}
