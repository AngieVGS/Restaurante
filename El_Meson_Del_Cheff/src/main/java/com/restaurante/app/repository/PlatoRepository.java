package com.restaurante.app.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.restaurante.app.entity.Plato;

@org.springframework.stereotype.Repository
public interface PlatoRepository extends Repository<Plato,Integer>{
	
	List<Plato> findAll();
//	Plato findOne(int id);
	Plato save(Plato plato);
	void delete(Plato plato);
	
}
