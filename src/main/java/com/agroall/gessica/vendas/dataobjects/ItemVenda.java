package com.agroall.gessica.vendas.dataobjects;

public class ItemVenda extends com.agroall.gessica.dataobjects.ItemVenda {
	
	private Double margemLucroItem;
	private Double descontoItem;
	
	private ProdutoComercial produtoComercial;
	
	public ItemVenda() {
		super();
		this.margemLucroItem = 0d;
		this.descontoItem = 0d;
	}
	
	public Double getMargemLucroItem() {
		return margemLucroItem;
	}
	
	public void setMargemLucroItem(Double margemLucroItem) {
		this.margemLucroItem = margemLucroItem;
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	public Double getDescontoItem() {
		return descontoItem;
	}
	
	public void setDescontoItem(Double descontoItem) {
		this.descontoItem = descontoItem;
		this.precoCalculado = resolvePrecoCalculado();
	}
	
	public ProdutoComercial getProdutoComercial() {
		return produtoComercial;
	}
	
	public void setProdutoComercial(ProdutoComercial produtoComercial) {
		this.produtoComercial = produtoComercial;
		if(produtoComercial == null) { return; }
		Double precoItem = produtoComercial.getPrecoCalculado();
		setPrecoItem(precoItem);
	}
	
	@Override
	protected Double resolvePrecoCalculado() {
		Double precoCalculado = super.resolvePrecoCalculado();
		if(this.descontoItem == null) { return precoCalculado; }
		if(this.margemLucroItem == null) { return precoCalculado; }
		precoCalculado = ((precoCalculado - this.descontoItem) + this.margemLucroItem);
		this.precoCalculado = precoCalculado;
		return precoCalculado;
	}
	
}
