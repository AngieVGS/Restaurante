package com.restaurante.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurante.app.entity.Pedido;

@Service
public interface PedidoService {
	
	public List<Pedido> listarPedido();
	public Pedido obtenerPedidoId(Long id_Pedido);
	public Pedido agregarPedido(Pedido Pedido);
	public Pedido editarPedido(Pedido Pedido);
	public Pedido eliminarPedido(Long id_Pedido);

}