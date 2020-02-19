package com.restaurante.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.app.entity.Ingrediente;
import com.restaurante.app.repository.IngredienteRepositorio;

@Service
public class IngredienteServiceImp implements IngredientesService {

	@Autowired
	private IngredienteRepositorio ingredienteRepositorio;
	
	@Override
	public List<Ingrediente> listarIngrediente() {
		return ingredienteRepositorio.findAll();
	}

	@Override
	public Ingrediente obtenerIngredienteId(Long id_ingrediente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingrediente agregarIngrediente(Ingrediente ingrediente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingrediente editarIngrediente(Ingrediente ingrediente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingrediente eliminarIngrediente(Long id_ingrediente) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
