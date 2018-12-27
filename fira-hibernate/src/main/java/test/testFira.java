package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.fira.hibernate.modelo.Fira;

public class testFira {
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
	 emf = Persistence.createEntityManagerFactory("aplicacion");
	 manager = emf.createEntityManager();
	 
	 Fira feria1 = new Fira(1,"Feria Digital", 300);
	 Fira feria2 = new Fira(2,"Feria Turismo", 200);
	 
	 manager.getTransaction().begin();
	 manager.persist(feria1);
	 manager.persist(feria2);
	 manager.getTransaction().commit();
	 
	@SuppressWarnings("unchecked")
	List<Fira> ferias = manager.createQuery("FROM Fira").getResultList();
	System.out.println("En la base de datos hay " + ferias.size() + " ferias");
	
	for (Fira feria: ferias) {
		System.out.println(feria.toString());
	}

	}

}
