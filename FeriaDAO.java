import java.util.ArrayList;

public interface FeriaDAO {
	public void addFeria( Feria feria);
	public void updateFeria (Feria feria);
	public void deleteFeria(Feria feria);
	public boolean addStand(Stand stand);
	public ArrayList<Stand> getListaStands();
	public void setListaStands(ArrayList<Stand> listaStands);
}
