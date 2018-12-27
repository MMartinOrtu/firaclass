package primero;

import org.hibernate.Session;

public class TestHibernateInsert {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        
	        //Add new Employee object
	        Feria feria2 = new Feria();
	        feria2.setNombre("Feria de turismo");
	        feria2.setSuperficieFeria(400);
	  
	         
	        //Save the employee in database
	        session.save(feria2);
	 
	        //Commit the transaction
	        session.getTransaction().commit();
	        HibernateUtil.shutdown();
	}

}
