package com.restaurante.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Platos")
public class Plato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_plato;
	
	@Column
	private Boolean estado_plato;
	
	@Column
	private String nombre_plato;
	
	@Column
	private String descripcion_plato;
	
	@Column
	private Long precio_plato;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "plato_ingrediente", joinColumns = @JoinColumn(name = "id_plato"), inverseJoinColumns = @JoinColumn(name = "id_ingrediente"))
	private List<Ingrediente> ingredientes_plato;

	public Long getId_plato() {
		return id_plato;
	}

	public void setId_plato(Long id_plato) {
		this.id_plato = id_plato;
	}

	public Boolean getEstado_plato() {
		return estado_plato;
	}

	public void setEstado_plato(Boolean estado_plato) {
		this.estado_plato = estado_plato;
	}

	public String getNombre_plato() {
		return nombre_plato;
	}

	public void setNombre_plato(String nombre_plato) {
		this.nombre_plato = nombre_plato;
	}

	public String getDescripcion_plato() {
		return descripcion_plato;
	}

	public void setDescripcion_plato(String descripcion_plato) {
		this.descripcion_plato = descripcion_plato;
	}

	public Long getPrecio_plato() {
		return precio_plato;
	}

	public void setPrecio_plato(Long precio_plato) {
		this.precio_plato = precio_plato;
	}

	public List<Ingrediente> getIngredientes_plato() {
		return ingredientes_plato;
	}

	public void setIngredientes_plato(List<Ingrediente> ingredientes_plato) {
		this.ingredientes_plato = ingredientes_plato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion_plato == null) ? 0 : descripcion_plato.hashCode());
		result = prime * result + ((estado_plato == null) ? 0 : estado_plato.hashCode());
		result = prime * result + ((id_plato == null) ? 0 : id_plato.hashCode());
		result = prime * result + ((ingredientes_plato == null) ? 0 : ingredientes_plato.hashCode());
		result = prime * result + ((nombre_plato == null) ? 0 : nombre_plato.hashCode());
		result = prime * result + ((precio_plato == null) ? 0 : precio_plato.hashCode());
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
		Plato other = (Plato) obj;
		if (descripcion_plato == null) {
			if (other.descripcion_plato != null)
				return false;
		} else if (!descripcion_plato.equals(other.descripcion_plato))
			return false;
		if (estado_plato == null) {
			if (other.estado_plato != null)
				return false;
		} else if (!estado_plato.equals(other.estado_plato))
			return false;
		if (id_plato == null) {
			if (other.id_plato != null)
				return false;
		} else if (!id_plato.equals(other.id_plato))
			return false;
		if (ingredientes_plato == null) {
			if (other.ingredientes_plato != null)
				return false;
		} else if (!ingredientes_plato.equals(other.ingredientes_plato))
			return false;
		if (nombre_plato == null) {
			if (other.nombre_plato != null)
				return false;
		} else if (!nombre_plato.equals(other.nombre_plato))
			return false;
		if (precio_plato == null) {
			if (other.precio_plato != null)
				return false;
		} else if (!precio_plato.equals(other.precio_plato))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plato [id_plato=" + id_plato + ", estado_plato=" + estado_plato + ", nombre_plato=" + nombre_plato
				+ ", descripcion_plato=" + descripcion_plato + ", precio_plato=" + precio_plato
				+ ", ingredientes_plato=" + ingredientes_plato + "]";
	}
}