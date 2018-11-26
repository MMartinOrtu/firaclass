
public class Modular extends Stand {

	private String tipoStand;	
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
	public Modular(int superficie, double precio, int numeroModulos) {
		super(superficie, precio);
		this.tipoStand = "MODULAR";
		this.numeroModulos = numeroModulos;
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
	 * @param tipoStand the tipoStand to set
	 */
	public void setTipoStand(String tipoStand) {
		this.tipoStand = tipoStand;
	}

	/**
	 * @return the tIPO_STAND
	 */
	public String getTipoStand() {
		return tipoStand;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Modular [id=%s, tipoStand=%s, numeroModulos=%s, superficie=%s metros, precio=%s euros]\n",
				getId(),getTipoStand(), numeroModulos, getSuperficie(), getPrecio());
	}

	
	
}
