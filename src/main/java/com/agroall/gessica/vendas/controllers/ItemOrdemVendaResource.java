package com.agroall.gessica.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.services.Service;
import com.agroall.gessica.vendas.dataobjects.ItemOrdemVenda;
import com.agroall.gessica.vendas.services.ItemOrdemVendaService;

public class ItemOrdemVendaResource extends DataObjectResourceControllerImpl<ItemOrdemVenda> {
	
	@Autowired private ItemOrdemVendaService service;
	
	@Override
	protected Service<ItemOrdemVenda> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ItemOrdemVenda doGet() {
		return super.doGet();
	}

}
