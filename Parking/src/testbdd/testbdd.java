package testbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelbean.Parkingbean;

public class testbdd {
	private static String DBURL = "jdbc:mysql://localhost:8889/parking";
	private static String DBLOGIN = "root";
	private static String DBPASSWORD = "root";
	public static void main(String[] args) {
		System.out.println("Start");
		/* Chargement du driver JDBC pour MySQL */
		try {
			System.out.println( "Chargement du driver..." );
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println( "Driver chargé" );
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// Step 2: Connexion à la base de données 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			System.out.println("Connexion à la base de données...");
			conn = DriverManager.getConnection(DBURL, DBLOGIN, DBPASSWORD);
			System.out.println("Connexion réussie");
			
			/* Création de l'objet gérant les requêtes */
			stmt = conn.createStatement();
			System.out.println("Objet requête créée");
			
			 /* Exécution d'une requête de lecture */
			Parkingbean parking =new Parkingbean();
			rset = stmt.executeQuery("INSERT INTO parking (id,NOM,ADRESSE,PRIX) values (12,drake,AREF,34)");
			/*rset = stmt.executeQuery("SELECT * FROM parking");
			
		    /* Récupération des données du résultat de la requête de lecture */
			while (rset.next()) {
				System.out.println(rset.getString("NOM"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//Step 6: Release resources
			try {
				if (rset != null)
					rset.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}}}