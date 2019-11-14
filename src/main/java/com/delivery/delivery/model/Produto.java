package com.delivery.delivery.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private double preco;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<Produto> ingredientes;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<Produto> adicionais;
	private int qtd;
	private String observacao;
		
	private Tipo tipo;

	public Produto() {
	}

	public Produto(long id, String nome, double preco, List<Produto> ingredientes, List<Produto> adicionais, int qtd,
			String observacao, Tipo tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
//		this.ingredientes = ingredientes;
//		this.adicionais = adicionais;
		this.qtd = qtd;
		this.observacao = observacao;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

//	public List<Produto> getIngredientes() {
//		return ingredientes;
//	}
//
//	public void setIngredientes(List<Produto> ingredientes) {
//		this.ingredientes = ingredientes;
//	}
//
//	public List<Produto> getAdicionais() {
//		return adicionais;
//	}
//
//	public void setAdicionais(List<Produto> adicionais) {
//		this.adicionais = adicionais;
//	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

//	@Override
//	public String toString() {
//		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", ingredientes=" + ingredientes
//				+ ", adicionais=" + adicionais + ", qtd=" + qtd + ", observacao=" + observacao + ", tipo=" + tipo + "]";
//	}	
	
}
