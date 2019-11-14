package com.delivery.delivery.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delivery.delivery.model.Produto;
import com.delivery.delivery.model.Tipo;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long>{
	
	public List<Produto> findByTipo(Tipo tipo);

}
