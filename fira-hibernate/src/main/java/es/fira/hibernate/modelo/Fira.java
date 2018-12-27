package es.fira.hibernate.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fira")
public class Fira implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="superficie")
	private int superficieFeria;	
	
	public Fira () {
		
	}

	public Fira(int id, String nombre, int superficieFeria) {
		this.id = id;
		this.nombre = nombre;
		this.superficieFeria = superficieFeria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSuperficieFeria() {
		return superficieFeria;
	}

	public void setSuperficieFeria(int superficieFeria) {
		this.superficieFeria = superficieFeria;
	}

	@Override
	public String toString() {
		return "Fira [id=" + id + ", nombre=" + nombre + ", superficieFeria=" + superficieFeria + "]";
	}
	

	
}


