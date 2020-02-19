package com.restaurante.app.service;

import java.util.List;

import com.restaurante.app.entity.Mesa;

public interface MesaService {
	
	public List<Mesa> listarMesa();
	public Mesa obtenerMesaId(Long id_Mesa);
	public Mesa agregarMesa(Mesa Mesa);
	public Mesa editarMesa(Mesa Mesa);
	public Mesa eliminarMesa(Long id_Mesa);

}
