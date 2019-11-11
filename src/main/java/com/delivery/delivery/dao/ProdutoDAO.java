package com.delivery.delivery.dao;

import java.util.ArrayList;
import java.util.List;

import com.delivery.delivery.model.Batata;
import com.delivery.delivery.model.Produto;
import com.delivery.delivery.model.Tipo;

public class ProdutoDAO {

	List<Batata> batatas = new ArrayList<Batata>();
	List<Produto> adicionais = new ArrayList<Produto>();
	List<Produto> ingredientes = new ArrayList<Produto>();

	public ProdutoDAO() {
		popularMassaDeTestes();
	}

	public List<Produto> buscarTodosAdicionais() {
		return adicionais;
	}

	public List<Batata> buscarBatatas() {
		return batatas;
	}

	public boolean excluirBatata(int id) {
		boolean encontrou = false;

		for (Batata batata : batatas) {
			if (batata.getId() == id) {
				batatas.remove(batata);
				encontrou = true;
				break;
			}
		}

		return encontrou;
	}	
	
	public Batata buscarBatata(int id) {
		
		for (Batata batata : batatas) {
			if (batata.getId() == id) {
				return batata;
			}
		}
		
		return null;
	}
	
	void popularMassaDeTestes() {
		// POPULANDO LISTA DE ADICIONAIS
		Produto adicional1 = new Produto();
		adicional1.setId(1);
		adicional1.setNome("Bacon");
		adicional1.setPreco(5.0);
		adicional1.setQtd(20);
		adicional1.setObservacao("Sem Observação");
		adicional1.setTipo(Tipo.ADICIONAL);

		Produto adicional2 = new Produto();
		adicional2.setId(2);
		adicional2.setNome("Calabresa");
		adicional2.setPreco(1.5);
		adicional2.setQtd(30);
		adicional2.setObservacao("Sem Observação");
		adicional2.setTipo(Tipo.ADICIONAL);

		Produto adicional3 = new Produto();
		adicional3.setId(3);
		adicional3.setNome("Creem Cheese");
		adicional3.setPreco(3.0);
		adicional3.setQtd(10);
		adicional3.setObservacao("Sem Observação");
		adicional3.setTipo(Tipo.ADICIONAL);

		adicionais.add(adicional1);
		adicionais.add(adicional2);
		adicionais.add(adicional3);

		// POPULANDO LISTA DE INGREDIENTES
		Produto ingrediente1 = new Produto();
		ingrediente1.setNome("Ingrediente1");

		Produto ingrediente2 = new Produto();
		adicional2.setNome("Ingrediente2");

		Produto ingrediente3 = new Produto();
		adicional3.setNome("Ingrediente3");

		ingredientes.add(ingrediente1);
		ingredientes.add(ingrediente2);
		ingredientes.add(ingrediente3);

		// POPULANDO LISTA DE BATATAS
		Batata batata1 = new Batata();
		batata1.setId(1);
		batata1.setNome("Batata1");
		batata1.setPreco(5.0);
		batata1.setQtd(20);
		batata1.setObservacao("Sem Observação");
		batata1.setTipo(Tipo.BATATA);
		batata1.setAdicionais(buscarTodosAdicionais());
		batata1.setIngredientes(buscarTodosAdicionais());

		Batata batata2 = new Batata();
		batata2.setId(2);
		batata2.setNome("Batata2");
		batata2.setPreco(1.5);
		batata2.setQtd(30);
		batata2.setObservacao("Sem Observação");
		batata2.setTipo(Tipo.BATATA);
		batata2.setAdicionais(buscarTodosAdicionais());
		batata2.setIngredientes(buscarTodosAdicionais());

		Batata batata3 = new Batata();
		batata3.setId(3);
		batata3.setNome("Batata3");
		batata3.setPreco(3.0);
		batata3.setQtd(10);
		batata3.setObservacao("Sem Observação");
		batata3.setTipo(Tipo.BATATA);
		batata3.setAdicionais(buscarTodosAdicionais());
		batata3.setIngredientes(buscarTodosAdicionais());

		batatas.add(batata1);
		batatas.add(batata2);
		batatas.add(batata3);

	}
}
