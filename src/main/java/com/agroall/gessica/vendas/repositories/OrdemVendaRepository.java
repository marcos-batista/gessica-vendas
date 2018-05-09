package com.agroall.gessica.vendas.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.vendas.dataobjects.OrdemVenda;

public interface OrdemVendaRepository extends MongoRepository<OrdemVenda, String>, Repository {
	
	List<OrdemVenda> findById(String id);
	
}
