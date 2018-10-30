
public class Modular extends Stand {

	private final String TIPO_STAND = "Modular";	
	private int numeroModulos;
	
	
	
	/**
	 * 
	 */
	public Modular() {
	}
	/**
	 * @param id
	 * @param superficie
	 * @param d
	 * @param numeroModulos
	 */
	
	public Modular(int id, int superficie, double d, int numeroModulos) {
		super(id, superficie, d);
		this.numeroModulos = numeroModulos;
	}
	/**
	 * @param id
	 * @param superficie
	 * @param precio
	 */
	public Modular(int id, int superficie, double precio) {
		super(id, superficie, precio);
	}
	/**
	 * @return the numeroModulos
	 */
	public int getNumeroModulos() {
		return numeroModulos;
	}
	/**
	 * @param numeroModulos the numeroModulos to set
	 */
	public void setNumeroModulos(int numeroModulos) {
		this.numeroModulos = numeroModulos;
	}
	/**
	 * @return the tIPO_STAND
	 */
	public String getTIPO_STAND() {
		return TIPO_STAND;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Modular [TIPO_STAND=%s, numeroModulos=%s]", TIPO_STAND, numeroModulos);
	}

	
	
}
