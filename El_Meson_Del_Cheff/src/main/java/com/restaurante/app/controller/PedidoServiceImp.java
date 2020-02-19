package com.restaurante.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.app.entity.Pedido;
import com.restaurante.app.repository.PedidoRepository;
import com.restaurante.app.service.PedidoService;

@Service
public class PedidoServiceImp implements PedidoService {

	@Autowired
	private PedidoRepository PedidoRepositorio;
	
	@Override
	public List<Pedido> listarPedido() {
		return PedidoRepositorio.findAll();
	}

	@Override
	public Pedido obtenerPedidoId(Long id_Pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido agregarPedido(Pedido Pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido editarPedido(Pedido Pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido eliminarPedido(Long id_Pedido) {
		// TODO Auto-generated method stub
		return null;
	}
}
