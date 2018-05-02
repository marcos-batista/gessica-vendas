package com.agroall.gessica.vendas.dataobjects;

import com.agroall.gessica.dataobjects.ItemVenda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

public class ItemOrdemVenda extends ItemVenda implements Persistent<Integer> {
	
	private Integer id;
	
	@Override
	public Integer getId() {
		return this.id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = (Integer) id;
	}
	
}
