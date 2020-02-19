package com.restaurante.app.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.restaurante.app.entity.Pedido;

@org.springframework.stereotype.Repository
public interface PedidoRepository extends Repository<Pedido,Integer>{
	
	List<Pedido> findAll();
//	Pedido findOne(int id);
	Pedido save(Pedido Pedido);
	void delete(Pedido Pedido);
	
}

