package com.restaurante.app.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_pedido;
	
	@Column
	private Date fecha_pedido;
	
	@JoinColumn(name ="id_mesa")
	@OneToOne
	private Mesa mesa;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "platos_pedido", joinColumns = @JoinColumn(name = "pedido_id"), inverseJoinColumns = @JoinColumn(name = "plato_id"))
	private Set<Plato> lista_platos;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "bebidas_pedido", joinColumns = @JoinColumn(name = "pedido_id"), inverseJoinColumns = @JoinColumn(name = "bebida_id"))
	private Set<Bebida> lista_bebida;

	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Date getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(Date fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Set<Plato> getLista_platos() {
		return lista_platos;
	}

	public void setLista_platos(Set<Plato> lista_platos) {
		this.lista_platos = lista_platos;
	}

	public Set<Bebida> getLista_bebida() {
		return lista_bebida;
	}

	public void setLista_bebida(Set<Bebida> lista_bebida) {
		this.lista_bebida = lista_bebida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha_pedido == null) ? 0 : fecha_pedido.hashCode());
		result = prime * result + ((id_pedido == null) ? 0 : id_pedido.hashCode());
		result = prime * result + ((lista_bebida == null) ? 0 : lista_bebida.hashCode());
		result = prime * result + ((lista_platos == null) ? 0 : lista_platos.hashCode());
		result = prime * result + ((mesa == null) ? 0 : mesa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (fecha_pedido == null) {
			if (other.fecha_pedido != null)
				return false;
		} else if (!fecha_pedido.equals(other.fecha_pedido))
			return false;
		if (id_pedido == null) {
			if (other.id_pedido != null)
				return false;
		} else if (!id_pedido.equals(other.id_pedido))
			return false;
		if (lista_bebida == null) {
			if (other.lista_bebida != null)
				return false;
		} else if (!lista_bebida.equals(other.lista_bebida))
			return false;
		if (lista_platos == null) {
			if (other.lista_platos != null)
				return false;
		} else if (!lista_platos.equals(other.lista_platos))
			return false;
		if (mesa == null) {
			if (other.mesa != null)
				return false;
		} else if (!mesa.equals(other.mesa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [id_pedido=" + id_pedido + ", fecha_pedido=" + fecha_pedido + ", mesa=" + mesa
				+ ", lista_platos=" + lista_platos + ", lista_bebida=" + lista_bebida + "]";
	}
}