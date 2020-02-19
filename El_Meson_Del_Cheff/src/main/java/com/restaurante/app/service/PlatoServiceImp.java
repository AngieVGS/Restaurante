package com.restaurante.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.app.entity.Plato;
import com.restaurante.app.repository.PlatoRepository;

@Service
public class PlatoServiceImp implements PlatoService {

	@Autowired
	private PlatoRepository PlatoRepositorio;
	
	@Override
	public List<Plato> listarPlato() {
		return PlatoRepositorio.findAll();
	}

	@Override
	public Plato obtenerPlatoId(Long id_Plato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plato agregarPlato(Plato Plato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plato editarPlato(Plato Plato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plato eliminarPlato(Long id_Plato) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
