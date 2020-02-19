package com.restaurante.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurante.app.entity.Ingrediente;

@Service
public interface IngredientesService {
	
	public List<Ingrediente> listarIngrediente();
	public Ingrediente obtenerIngredienteId(Long id_ingrediente);
	public Ingrediente agregarIngrediente(Ingrediente ingrediente);
	public Ingrediente editarIngrediente(Ingrediente ingrediente);
	public Ingrediente eliminarIngrediente(Long id_ingrediente);

}
