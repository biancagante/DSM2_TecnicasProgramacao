package br.com.fatecpg.atvpratica.view;
import br.com.fatecpg.atvpratica.model.*;

public class Main {

	public static void main(String[] args) {
		/*
		Loja lojaUm = new Loja(3);
		lojaUm.setProduto(1, "Teclado", 5, 120);
		lojaUm.setProduto(2, "Mouse", 7, 75);
		lojaUm.setProduto(3, "Mousepad", 3, 15);
		lojaUm.getProdutos();
		System.out.println(lojaUm.produtosDestaque());
		System.out.println("Valor total do estoque é: " + lojaUm.valorTotalEstoque());
		
		System.out.println(lojaUm.comprarProduto(2, 3));
		*/
		VideoLocadora vLocadoraUm = new VideoLocadora(3);
		vLocadoraUm.setFilmes(1, "Barbie Escola de Princesas", 12, 5);
		vLocadoraUm.setFilmes(2, "Barbie em a Princesa e a Plebeia", 2, 5);
		vLocadoraUm.setFilmes(3, "Barbie: O Filme", 2, 8);
		
		vLocadoraUm.getFilmes();
		
		System.out.println("O faturamento total da locadora se todos os filmes fossem alugados: " + vLocadoraUm.faturamentoTotal());
		System.out.println(vLocadoraUm.filmeMaisAlugado());
		
		System.out.println(vLocadoraUm.alugarFilme(1, 2));
		System.out.println(vLocadoraUm.filmeMaisAlugado());
		System.out.println(vLocadoraUm.devolverFilme(1, 2));
		System.out.println(vLocadoraUm.devolverFilme(2, 1));
	}

}
