package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysql_denemeleri {

	public static void main(String[] args) {
		try {
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme","root","root");
			Statement myStat = myConn.createStatement();
			ResultSet myRS = myStat.executeQuery("select * from deneme.new_table");
			
			while(myRS.next()) {
				System.out.println(myRS.getString("ogr_no") + " - " + myRS.getString("ogr_ad") + " - " + myRS.getString("ogr_soyad"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
