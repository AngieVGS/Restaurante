package com.restaurante.app.service;

import java.util.List;

import com.restaurante.app.entity.Bebida;

public interface BebidaService {
	
	public List<Bebida> listarBebida();
	public Bebida obtenerBebidaId(Long id_Bebida);
	public Bebida agregarBebida(Bebida Bebida);
	public Bebida editarBebida(Bebida Bebida);
	public Bebida eliminarBebida(Long id_Bebida);

}
