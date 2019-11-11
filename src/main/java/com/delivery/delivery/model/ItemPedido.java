package com.delivery.delivery.model;

public class ItemPedido {
	
	private long codItem;
	private Produto produto;
	private int qtd;
	private double valorUnitario;
	private long codPedido;
	
	public ItemPedido() {		
	}
	
	public ItemPedido(long codItem, Produto produto, int qtd, double valorUnitario, long codPedido) {
		super();
		this.codItem = codItem;
		this.produto = produto;
		this.qtd = qtd;
		this.valorUnitario = valorUnitario;
		this.codPedido = codPedido;
	}

	public long getCodItem() {
		return codItem;
	}

	public void setCodItem(long codItem) {
		this.codItem = codItem;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public long getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(long codPedido) {
		this.codPedido = codPedido;
	}	

}
