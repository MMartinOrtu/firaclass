import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modular modular1 = new Modular(1, 10 , 24.12, 2);
		Personalizado personalizado2 = new Personalizado(1, 10 , 24.12, "colores vivos");
		
		System.out.println(modular1);
		System.out.println(personalizado2);
		
		Feria feria1 = new Feria("coches", 300);
		
		feria1.addStand(modular1);
		feria1.addStand(personalizado2);
		
		System.out.println(feria1.getListaStands());
		

		try {
			XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("prueba.xml")));
			e.writeObject(feria1);
			e.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(modular1);
			e.printStackTrace();
		}

	}
	



}
