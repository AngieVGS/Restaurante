package com.restaurante.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.app.entity.Bebida;
import com.restaurante.app.repository.BebidaRepository;

@Service
public class BebidaServiceImp implements BebidaService {

	@Autowired
	private BebidaRepository BebidaRepositorio;
	
	@Override
	public List<Bebida> listarBebida() {
		return BebidaRepositorio.findAll();
	}

	@Override
	public Bebida obtenerBebidaId(Long id_Bebida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bebida agregarBebida(Bebida Bebida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bebida editarBebida(Bebida Bebida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bebida eliminarBebida(Long id_Bebida) {
		// TODO Auto-generated method stub
		return null;
	}
}	