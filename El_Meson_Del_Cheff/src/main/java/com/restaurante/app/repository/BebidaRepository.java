package com.restaurante.app.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.restaurante.app.entity.Bebida;

@org.springframework.stereotype.Repository
public interface BebidaRepository extends Repository<Bebida,Integer>{
	
	List<Bebida> findAll();
//	Bebida findOne(int id);
	Bebida save(Bebida Bebida);
	void delete(Bebida Bebida);
	
}
