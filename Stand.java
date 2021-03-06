package primero;
// Generated 23-dic-2018 14:43:26 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Stand generated by hbm2java
 */
@Entity
@Table(name="stand")
public class Stand implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_stand", unique = true, nullable = false)
	private Integer idStand;
	private Feria feria;
	
	@Column(name = "superficie")
	private String superficie;
	
	@Column(name = "precio")
	private Integer precio;
	
	private Personalizado personalizado;
	private Modular modular;

	public Stand() {
	}

	public Stand(Feria feria, String superficie, Integer precio, Personalizado personalizado, Modular modular) {
		this.feria = feria;
		this.superficie = superficie;
		this.precio = precio;
		this.personalizado = personalizado;
		this.modular = modular;
	}

	public Integer getIdStand() {
		return this.idStand;
	}

	public void setIdStand(Integer idStand) {
		this.idStand = idStand;
	}

	public Feria getFeria() {
		return this.feria;
	}

	public void setFeria(Feria feria) {
		this.feria = feria;
	}

	public String getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public Integer getPrecio() {
		return this.precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Personalizado getPersonalizado() {
		return this.personalizado;
	}

	public void setPersonalizado(Personalizado personalizado) {
		this.personalizado = personalizado;
	}

	public Modular getModular() {
		return this.modular;
	}

	public void setModular(Modular modular) {
		this.modular = modular;
	}

}
