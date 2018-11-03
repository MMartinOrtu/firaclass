import java.util.ArrayList;

public class Feria {
	private String nombre;
	private int superficieFeria;	
	private ArrayList<Stand> listaStands = new ArrayList<Stand>();
		
	/**
	 * 
	 */
	public Feria() {
	}
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

	public boolean addStand(Stand stand) {
		boolean noExists = true;
		for (int i=0;i<this.listaStands.size(); i++) {
				if (stand.equals(this.listaStands.get(i))){
					noExists = false;
					System.out.println("Este stand no se puede añadir porque ya existe");
					break;
				}
		}
		if (noExists) {	
			this.listaStands.add(stand);
			System.out.println("Stand añadido correctamente a la Feria");
		}
		return noExists;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Feria [NOMBRE=%s, SUPERFICIE DE_LA_FERIA=%s metras, LISTADO_DE_STANDS=%s]", nombre, superficieFeria, listaStands);
	}

		
	
	
}
