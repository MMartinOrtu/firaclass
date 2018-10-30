
public class Stand {
	private int id;
	private int superficie;
	private double precio;
	
	
	
	/**
	 * @param id
	 * @param superficie
	 * @param precio
	 */
	public Stand(int id, int superficie, double precio) {
		this.id = id;
		this.superficie = superficie;
		this.precio = precio;
	}

	/**
	 * @return the id
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
	 * @return the superficie
	 */
	public int getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Stand [id=%s, superficie=%s, precio=%s]", id, superficie, precio);
	}
	
	
	
	
	
	
	

}