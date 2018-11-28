import java.sql.*;

public class ConexionDB {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
	
		try {
			//Crear conexión
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fira?autoReconnect=true&useSSL=false", "root", "miguel");
			
			//Crear objeto statment
			
			//Statement statement = conn.createStatement();
			
			//Para ejecutar las setencias SQL y prevenir un ataque SQLInyection uso parameterized queries con PreparedStatement
			
			 String idStand = "1";
			
			 String query = "select * from feria WHERE id_feria = ? ";
			 
			 PreparedStatement pstmt = conn.prepareStatement( query );
			 pstmt.setString( 1, idStand); 
			 ResultSet rst = pstmt.executeQuery( );
			
			
			//Recorrer el resultSet
			
			while(rst.next()) {
				System.out.println(rst.getString(2));
			}			
			
		}catch(Exception e0) {
			System.out.println("Error de conexión");
		}

	}

}
