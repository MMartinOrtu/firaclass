import java.util.ArrayList;

public class Feria {
	private String nombre;
	private int superficieFeria;	
	private ArrayList<Stand> listaStands = new ArrayList<Stand>();
		
	
	/**
	 * @param nombre
	 * @param superficieFeria
	 */
	public Feria(String nombre, int superficieFeria) {
		this.nombre = nombre;
		this.superficieFeria = superficieFeria;
	}
	/**
	 * @param nombre
	 * @param superficieFeria
	 * @param listaStands
	 */
	public Feria(String nombre, int superficieFeria, ArrayList<Stand> listaStands) {
		this.nombre = nombre;
		this.superficieFeria = superficieFeria;
		this.listaStands = listaStands;
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
	/**
	 * @return the listaStands
	 */
	public ArrayList<Stand> getListaStands() {
		return listaStands;
	}
	/**
	 * @param listaStands the listaStands to set
	 */
	public void setListaStands(ArrayList<Stand> listaStands) {
		this.listaStands = listaStands;
	}
	
	/**
	 * Método que permite añadir un stand
	 * al listado de Stands
	 * @param stand - nombre del objeto Stand
	 */
	public void addStand(Stand stand) {
		this.listaStands.add(stand);
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Feria [nombre=%s, superficieFeria=%s, listaStands=%s]", nombre, superficieFeria,
				listaStands);
	}

		
	
	
}
