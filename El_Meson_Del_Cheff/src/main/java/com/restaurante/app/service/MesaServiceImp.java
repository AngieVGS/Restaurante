package com.restaurante.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.app.entity.Mesa;
import com.restaurante.app.repository.MesaRepository;

@Service
public class MesaServiceImp implements MesaService {

	@Autowired
	private MesaRepository mesaRepositorio;
	
	@Override
	public List<Mesa> listarMesa() {
		return mesaRepositorio.findAll();
	}

	@Override
	public Mesa obtenerMesaId(Long id_Mesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mesa agregarMesa(Mesa Mesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mesa editarMesa(Mesa Mesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mesa eliminarMesa(Long id_Mesa) {
		// TODO Auto-generated method stub
		return null;
	}
}	