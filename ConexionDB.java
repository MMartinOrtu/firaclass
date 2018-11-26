import java.io.File;
import java.sql.*;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
public class ConexionDB {

	static public String getAttrValue(Node node,String attrName) {
	    if ( ! node.hasAttributes() ) return "";
	    NamedNodeMap nmap = node.getAttributes();
	    if ( nmap == null ) return "";
	    Node n = (Node) nmap.getNamedItem(attrName);
	    if ( n == null ) return "";
	    return n.getNodeValue();
	}
	

	static private String getTextContent(Node parentNode,String childName) {
	    NodeList nlist = parentNode.getChildNodes();
	    for (int i = 0 ; i < nlist.getLength() ; i++) {
	    Node n = (Node) nlist.item(i);
	    String name = n.getNodeName();
	    if ( name != null && name.equals(childName) )
	        return n.getTextContent();
	    }
	    return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub



	
		try {
			//Crear conexión
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing?autoReconnect=true&useSSL=false", "root", "eirene");
			
			
			//XML

			File file = new File("books.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document xmlDoc = (Document) builder.parse(file);
			
			XPath xpath = XPathFactory.newInstance().newXPath();
			Object res = xpath.evaluate("/catalog/book",
			                 xmlDoc,
			                 XPathConstants.NODESET);
			

			PreparedStatement stmt = conn
			    .prepareStatement("INSERT INTO books(\n" +
			              " book_id, author, title, genre, price,\n" +
			                 " publish_date, description)\n" +
			                  "VALUES(?, ?, ?, ?, ?,\n" +
			                  " str_to_date(?, '%Y-%m-%d'), ?)");
			

		for (int i = 0 ; i < xmlDoc.getLength() ; i++) {
		    Node node = (Node) ((NamedNodeMap) xmlDoc).item(i);
		    List<String> columns = Arrays
		    .asList(getAttrValue(node, "id"),
		        getTextContent(node, "author"),
		        getTextContent(node, "title"),
		        getTextContent(node, "genre"),
		        getTextContent(node, "price"),
		        getTextContent(node, "publish_date"),
		        getTextContent(node, "description"));
		    for (int n = 0 ; n < columns.size() ; n++) {
		    stmt.setString(n+1, columns.get(n));
		    }
		    stmt.execute();
		}
			//Crear objeto statment
			
			//Statement statement = conn.createStatement();
			
			//Para ejecutar las setencias SQL y prevenir un ataque SQLInyection uso parameterized queries con PreparedStatement
			
			 String nombre = "Juan";
			
			 String query = "select * from empleado WHERE nombre = ? ";
			 
			 PreparedStatement pstmt = conn.prepareStatement( query );
			 pstmt.setString( 1, nombre); 
			 ResultSet rst = pstmt.executeQuery( );
			
			
			//Recorrer el resultSet
			
			while(rst.next()) {
				System.out.println(rst.getString(4));
			}			
			
		}catch(Exception e0) {
			System.out.println("Error de conexión");
		}

	}

}
