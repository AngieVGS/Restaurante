package com.restaurante.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Mesas")
public class Mesa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_mesa;
	
	@Column
	private Boolean estado_mesa;
	
	@Column
	private String nombre_mesa;
	
	@Column
	private String descripcion_mesa;
	
	@JoinColumn(name ="id_Pedido")
	@OneToOne
	private Pedido pedidoActual;

	public Long getId_mesa() {
		return id_mesa;
	}

	public void setId_mesa(Long id_mesa) {
		this.id_mesa = id_mesa;
	}

	public Boolean getEstado_mesa() {
		return estado_mesa;
	}

	public void setEstado_mesa(Boolean estado_mesa) {
		this.estado_mesa = estado_mesa;
	}

	public String getNombre_mesa() {
		return nombre_mesa;
	}

	public void setNombre_mesa(String nombre_mesa) {
		this.nombre_mesa = nombre_mesa;
	}

	public String getDescripcion_mesa() {
		return descripcion_mesa;
	}

	public void setDescripcion_mesa(String descripcion_mesa) {
		this.descripcion_mesa = descripcion_mesa;
	}

	public Pedido getPedidoActual() {
		return pedidoActual;
	}

	public void setPedidoActual(Pedido pedidoActual) {
		this.pedidoActual = pedidoActual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion_mesa == null) ? 0 : descripcion_mesa.hashCode());
		result = prime * result + ((estado_mesa == null) ? 0 : estado_mesa.hashCode());
		result = prime * result + ((id_mesa == null) ? 0 : id_mesa.hashCode());
		result = prime * result + ((nombre_mesa == null) ? 0 : nombre_mesa.hashCode());
		result = prime * result + ((pedidoActual == null) ? 0 : pedidoActual.hashCode());
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
		Mesa other = (Mesa) obj;
		if (descripcion_mesa == null) {
			if (other.descripcion_mesa != null)
				return false;
		} else if (!descripcion_mesa.equals(other.descripcion_mesa))
			return false;
		if (estado_mesa == null) {
			if (other.estado_mesa != null)
				return false;
		} else if (!estado_mesa.equals(other.estado_mesa))
			return false;
		if (id_mesa == null) {
			if (other.id_mesa != null)
				return false;
		} else if (!id_mesa.equals(other.id_mesa))
			return false;
		if (nombre_mesa == null) {
			if (other.nombre_mesa != null)
				return false;
		} else if (!nombre_mesa.equals(other.nombre_mesa))
			return false;
		if (pedidoActual == null) {
			if (other.pedidoActual != null)
				return false;
		} else if (!pedidoActual.equals(other.pedidoActual))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mesa [id_mesa=" + id_mesa + ", estado_mesa=" + estado_mesa + ", nombre_mesa=" + nombre_mesa
				+ ", descripcion_mesa=" + descripcion_mesa + ", pedidoActual=" + pedidoActual + "]";
	}
	
}