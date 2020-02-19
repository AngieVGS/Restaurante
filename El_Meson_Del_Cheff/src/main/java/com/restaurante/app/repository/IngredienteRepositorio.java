package com.restaurante.app.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.restaurante.app.entity.Ingrediente;

@org.springframework.stereotype.Repository
public interface IngredienteRepositorio extends Repository<Ingrediente,Long>{
	
	List<Ingrediente> findAll();
//	Ingrediente findOne(l id);
	Ingrediente save(Ingrediente ingrediente);
	void delete(Ingrediente ingrediente);
	
}
