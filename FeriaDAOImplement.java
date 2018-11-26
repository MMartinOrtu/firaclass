import java.util.ArrayList;

public class FeriaDAOImplement implements FeriaDAO {

	private ArrayList<Feria> listaFerias = new ArrayList<Feria>();
	private ArrayList<Stand> listaStands = new ArrayList<Stand>();
	
	@Override
	public void addFeria(Feria feria) {
		listaFerias.add(feria);
	
	}

	@Override
	public void updateFeria(Feria feria) {
		listaFerias.set(feria.getId(), feria);
		
	}

	@Override
	public void deleteFeria(Feria feria) {
		listaFerias.remove(feria);
		
	}
	
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

	public ArrayList<Stand> getListaStands() {
		return listaStands;
	}


	public void setListaStands(ArrayList<Stand> listaStands) {
		this.listaStands = listaStands;
	}

	/**
	 * @return the listaFerias
	 */
	public ArrayList<Feria> getListaFerias() {
		return listaFerias;
	}

	/**
	 * @param listaFerias the listaFerias to set
	 */
	public void setListaFerias(ArrayList<Feria> listaFerias) {
		this.listaFerias = listaFerias;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("FeriaDAOImplement [listaFerias=%s, listaStands=%s]", listaFerias, listaStands);
	}


}
