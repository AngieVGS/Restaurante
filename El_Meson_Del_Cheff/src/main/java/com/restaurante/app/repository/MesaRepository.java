package com.restaurante.app.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.restaurante.app.entity.Mesa;

@org.springframework.stereotype.Repository
public interface MesaRepository extends Repository<Mesa,Integer>{
	
	List<Mesa> findAll();
//	Mesa findOne(int id);
	Mesa save(Mesa mesa);
	void delete(Mesa mesa);
	
}
