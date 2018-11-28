
public class Feria {
	public static int idFeria = 1;
	private int id;
	private String nombre;
	private int superficieFeria;	
		
	public Feria() {
	}
	/**
	 * @param nombre
	 * @param superficieFeria
	 */
	public Feria(String nombre, int superficieFeria) {
		this.id = idFeria++;
		this.nombre = nombre;
		this.superficieFeria = superficieFeria;
	}

	/**
	 * @return the idFeria
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the superficieFeria
	 */
	public int getSuperficieFeria() {
		return superficieFeria;
	}
	/**
	 * @param superficieFeria the superficieFeria to set
	 */
	public void setSuperficieFeria(int superficieFeria) {
		this.superficieFeria = superficieFeria;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Feria [id=%s, nombre=%s, superficieFeria=%s]", id, nombre, superficieFeria);
	}

		
	
	
}
