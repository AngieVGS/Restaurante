package com.restaurante.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.app.entity.Bebida;
import com.restaurante.app.entity.Ingrediente;
import com.restaurante.app.entity.Mesa;
import com.restaurante.app.entity.Pedido;
import com.restaurante.app.entity.Plato;
import com.restaurante.app.service.BebidaService;
import com.restaurante.app.service.IngredientesService;
import com.restaurante.app.service.MesaService;
import com.restaurante.app.service.PedidoService;
import com.restaurante.app.service.PlatoService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
public class AppController {

	@Autowired
	IngredientesService ingredientesService;
	
	@Autowired
	PlatoService platoService;
	
	@Autowired
	MesaService mesaService;
	
	@Autowired
	PedidoService pedidoService;
	
	@Autowired
	BebidaService bebidaService;
	
	@GetMapping("/verIngredientes")
	public List<Ingrediente> getIngredientes(){
		return ingredientesService.listarIngrediente(); 
	}
	
	@GetMapping("/verPlatos")
	public List<Plato> getPlatos(){
		return platoService.listarPlato(); 
	}
	
	@GetMapping("/verMesas")
	public List<Mesa> getMesas(){
		return mesaService.listarMesa(); 
	}
	
	@GetMapping("/verPedidos")
	public List<Pedido> getPedidos(){
		return pedidoService.listarPedido(); 
	}
	
	@GetMapping("/verBebidas")
	public List<Bebida> getBebidas(){
		return bebidaService.listarBebida(); 
	}
	
}
