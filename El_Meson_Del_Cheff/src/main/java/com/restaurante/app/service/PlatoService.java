package com.restaurante.app.service;

import java.util.List;

import com.restaurante.app.entity.Plato;

public interface PlatoService {
	
	public List<Plato> listarPlato();
	public Plato obtenerPlatoId(Long id_Plato);
	public Plato agregarPlato(Plato Plato);
	public Plato editarPlato(Plato Plato);
	public Plato eliminarPlato(Long id_Plato);

}
