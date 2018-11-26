import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creo de los stands
		Modular modular1 = new Modular(10, 240.50, 2);
		Modular modular2 = new Modular(12, 140.50, 3);
		Personalizado personalizado1 = new Personalizado(20, 350.00, "stand con pantallas digitales");
		Personalizado personalizado2 = new Personalizado(25, 360.00, "stand con palets de madera");
		
		// Creo la feria
		Feria feria1 = new Feria(1, "Feria Digital", 300);
		
		//Instancio el FeriaDAOFactory
		FeriaDAOFactory factory = new FeriaDAOFactory();
		
		//Creo el objeto feria DAO y le añado una feria
		FeriaDAO feriaDAO = factory.crearFeriaDAO();
		feriaDAO.addFeria(feria1);
		
		// Agrego los satands a la feria con el patrón DAO
		feriaDAO.addStand(modular1);
		feriaDAO.addStand(modular2);
		feriaDAO.addStand(personalizado1);
		feriaDAO.addStand(personalizado2);
		
		
		//Imprimo por pantalla la lista de stands		
		System.out.println(feriaDAO);
		

		try {
			XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("ObjetosFeriaDAO.xml")));
			e.writeObject(feriaDAO);
			e.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
