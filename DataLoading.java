
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataLoading {
	  static final String dbUrl ="jdbc:mysql://localhost:3306/fira?autoReconnect=true&useSSL=false";
	  static final String password = "miguel";
	  static final String user = "root";
	  public Connection conn; 

	  /*
	   * Load jdbc Drivemyr
	   */
	  static {
	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Dirver loaded");
	    } catch (ClassNotFoundException ex) {
	      System.err.println("Cannot load driver " + ex);
	    }
	  }

	  /*
	   * Connect to DB
	   */
	  public void connect() {
	    try {
	      conn = DriverManager.getConnection(dbUrl, user, password);
	      System.out.println("Database connected!");
	    } catch (SQLException e) {
	      System.err.println("Cannot connect the database!");
	    }
	  }

	  /*
	   * Create Table and Load Data
	   */
	  public void createTable() {
	    try {
	    conn.createStatement().execute("CREATE TABLE IF NOT EXISTS `fira`.FERIA\r\n" + 
	    		"(id_feria INT PRIMARY KEY NOT NULL AUTO_INCREMENT,\r\n" + 
	    		"nombre VARCHAR(50), \r\n" + 
	    		"superficie_feria INT\r\n" + 
	    		")");
	    conn.createStatement().execute("CREATE TABLE IF NOT EXISTS `fira`.STAND\r\n" + 
	    		"(id_stand INT PRIMARY KEY NOT NULL AUTO_INCREMENT,\r\n" + 
	    		"id_feria INT,\r\n" + 
	    		"superficie VARCHAR(50), \r\n" + 
	    		"precio INT,\r\n" + 
	    		"FOREIGN KEY( id_feria ) REFERENCES FERIA(id_feria)\r\n" + 
	    		")");
	    conn.createStatement().execute("CREATE TABLE IF NOT EXISTS `fira`.MODULAR\r\n" + 
	    		"(id_modular INT PRIMARY KEY NOT NULL AUTO_INCREMENT,\r\n" + 
	    		"numero_modulos INT,\r\n" + 
	    		"tipo_stand VARCHAR(50), \r\n" + 
	    		"FOREIGN KEY( id_modular ) REFERENCES STAND(id_stand)\r\n" + 
	    		")");
	    conn.createStatement().execute("\r\n" + 
	    		"CREATE TABLE IF NOT EXISTS `fira`.PERSONALIZADO\r\n" + 
	    		"(id_personalizado INT PRIMARY KEY NOT NULL AUTO_INCREMENT,\r\n" + 
	    		"caracteristicas VARCHAR(150),\r\n" + 
	    		"tipo_stand VARCHAR(50), \r\n" + 
	    		"FOREIGN KEY( id_personalizado ) REFERENCES STAND(id_stand)\r\n" + 
	    		")");
	     System.out.println("Tables created");
	     
	     //Load the dada to database from XML file
	      conn.createStatement().execute("LOAD XML LOCAL INFILE 'feria.xml' INTO TABLE feria ROWS IDENTIFIED BY '<feria>'");
	      conn.createStatement().execute("LOAD XML LOCAL INFILE 'feria.xml' INTO TABLE stand ROWS IDENTIFIED BY '<stand>'");
	      conn.createStatement().execute("LOAD XML LOCAL INFILE 'feria.xml' INTO TABLE modular ROWS IDENTIFIED BY '<modular>'");
	      conn.createStatement().execute("LOAD XML LOCAL INFILE 'feria.xml' INTO TABLE personalizado ROWS IDENTIFIED BY '<personalizado>'");
	      System.out.println("Data parsed");
	    } catch (SQLException e) {
	      // TODO Auto-generated catch block
	        System.out.println("Cannot create Table or load data" + e);
	    }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    DataLoading app =new DataLoading();
	    app.connect();
	    app.createTable();
	}

}
