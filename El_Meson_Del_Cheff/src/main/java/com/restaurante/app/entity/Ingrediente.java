package com.restaurante.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ingredientes")
public class Ingrediente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_ingrediente;
	
	@Column
	private String nombre_ingrediente;

	public Long getId_ingrediente() {
		return id_ingrediente;
	}

	public void setId_ingrediente(Long id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}

	public String getNombre_ingrediente() {
		return nombre_ingrediente;
	}

	public void setNombre_ingrediente(String nombre_ingrediente) {
		this.nombre_ingrediente = nombre_ingrediente;
	}

	@Override
	public String toString() {
		return "Ingrediente [id_ingrediente=" + id_ingrediente + ", nombre_ingrediente=" + nombre_ingrediente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_ingrediente == null) ? 0 : id_ingrediente.hashCode());
		result = prime * result + ((nombre_ingrediente == null) ? 0 : nombre_ingrediente.hashCode());
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
		Ingrediente other = (Ingrediente) obj;
		if (id_ingrediente == null) {
			if (other.id_ingrediente != null)
				return false;
		} else if (!id_ingrediente.equals(other.id_ingrediente))
			return false;
		if (nombre_ingrediente == null) {
			if (other.nombre_ingrediente != null)
				return false;
		} else if (!nombre_ingrediente.equals(other.nombre_ingrediente))
			return false;
		return true;
	}
	
	
}
