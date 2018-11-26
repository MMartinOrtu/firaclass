
public class Personalizado extends Stand  {

	private String tipoStand;
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
	public Personalizado(int superficie, double precio, String caracteristicas) {
		super(superficie, precio);
		this.caracteristicas = caracteristicas;
		this.tipoStand = "PERSONALIZADO";
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
	 * @return the tipoStand
	 */
	public String getTipoStand() {
		return tipoStand;
	}

	/**
	 * @param tipoStand the tipoStand to set
	 */
	public void setTipoStand(String tipoStand) {
		this.tipoStand = tipoStand;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Personalizado [id=%s, tipoStand=%s, caracteristicas=%s,  superficie=%s metros, precio=%s euros]\n",
				getId(), getTipoStand(), getCaracteristicas(),  getSuperficie(), getPrecio());
	}
	
	
}
