
public class Personalizado extends Stand  {

	private final String TIPO_STAND = "Personalizado";
	private String caracteristicas;
			
	/**
	 * 
	 */
	public Personalizado() {
	}

	/**
	 * @param id
	 * @param superficie
	 * @param precio
	 * @param caracteristicas
	 */
	public Personalizado(int id, int superficie, double precio, String caracteristicas) {
		super(id, superficie, precio);
		this.caracteristicas = caracteristicas;
	}
	
	
	/**
	 * @return the caracteristicas
	 */
	public String getCaracteristicas() {
		return caracteristicas;
	}
	/**
	 * @param caracteristicas the caracteristicas to set
	 */
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
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
		return String.format(
				"Personalizado [ID_STAND=%s, TIPO_DE_STAND=%s, CRACTERISTICAS=%s,  getSuperficie()=%s metros, getPrecio()=%s euros]\n",
				getId(), TIPO_STAND, caracteristicas,  getSuperficie(), getPrecio());
	}
	
	
}
