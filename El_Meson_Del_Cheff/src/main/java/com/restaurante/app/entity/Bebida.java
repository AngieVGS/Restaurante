package com.restaurante.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bebidas")
public class Bebida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_Bebida;
	
	@Column
	private Boolean estado_Bebida;
	
	@Column
	private String nombre_Bebida;
	
	@Column
	private String descripcion_Bebida;
	
	@Column
	private Long precio_Bebida;

	public Long getId_Bebida() {
		return id_Bebida;
	}

	public void setId_Bebida(Long id_Bebida) {
		this.id_Bebida = id_Bebida;
	}

	public Boolean getEstado_Bebida() {
		return estado_Bebida;
	}

	public void setEstado_Bebida(Boolean estado_Bebida) {
		this.estado_Bebida = estado_Bebida;
	}

	public String getNombre_Bebida() {
		return nombre_Bebida;
	}

	public void setNombre_Bebida(String nombre_Bebida) {
		this.nombre_Bebida = nombre_Bebida;
	}

	public String getDescripcion_Bebida() {
		return descripcion_Bebida;
	}

	public void setDescripcion_Bebida(String descripcion_Bebida) {
		this.descripcion_Bebida = descripcion_Bebida;
	}

	public Long getPrecio_Bebida() {
		return precio_Bebida;
	}

	public void setPrecio_Bebida(Long precio_Bebida) {
		this.precio_Bebida = precio_Bebida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion_Bebida == null) ? 0 : descripcion_Bebida.hashCode());
		result = prime * result + ((estado_Bebida == null) ? 0 : estado_Bebida.hashCode());
		result = prime * result + ((id_Bebida == null) ? 0 : id_Bebida.hashCode());
		result = prime * result + ((nombre_Bebida == null) ? 0 : nombre_Bebida.hashCode());
		result = prime * result + ((precio_Bebida == null) ? 0 : precio_Bebida.hashCode());
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
		Bebida other = (Bebida) obj;
		if (descripcion_Bebida == null) {
			if (other.descripcion_Bebida != null)
				return false;
		} else if (!descripcion_Bebida.equals(other.descripcion_Bebida))
			return false;
		if (estado_Bebida == null) {
			if (other.estado_Bebida != null)
				return false;
		} else if (!estado_Bebida.equals(other.estado_Bebida))
			return false;
		if (id_Bebida == null) {
			if (other.id_Bebida != null)
				return false;
		} else if (!id_Bebida.equals(other.id_Bebida))
			return false;
		if (nombre_Bebida == null) {
			if (other.nombre_Bebida != null)
				return false;
		} else if (!nombre_Bebida.equals(other.nombre_Bebida))
			return false;
		if (precio_Bebida == null) {
			if (other.precio_Bebida != null)
				return false;
		} else if (!precio_Bebida.equals(other.precio_Bebida))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bebida [id_Bebida=" + id_Bebida + ", estado_Bebida=" + estado_Bebida + ", nombre_Bebida="
				+ nombre_Bebida + ", descripcion_Bebida=" + descripcion_Bebida + ", precio_Bebida=" + precio_Bebida
				+ "]";
	}

}
