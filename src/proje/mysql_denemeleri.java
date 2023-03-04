package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysql_denemeleri {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://eu-west.connect.psdb.cloud/projedb?sslMode=VERIFY_IDENTITY";
		String userName = "so1v9apbx4bejso0xc7w";
		String password = "pscale_pw_gcYuqlcy2GrubiCmscYeGu31LcmbkQ1yqfgEIun2juT";
		try {
			Connection myConn = DriverManager.getConnection(dbURL, userName, password);
			Statement myStat = myConn.createStatement();
			myStat.executeUpdate("INSERT INTO projedb.new_table VALUES (5,'Ahmet', 'Burak')");
			ResultSet myRS = myStat.executeQuery("select * from projedb.new_table");
			
			while(myRS.next()) {
				System.out.println(myRS.getString("ogr_id") + " - " + myRS.getString("ogr_ad") + " - " + myRS.getString("ogr_soyad"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}
