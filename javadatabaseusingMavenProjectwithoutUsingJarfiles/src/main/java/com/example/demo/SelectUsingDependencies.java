package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUsingDependencies {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("select*from emp");
	    while(r.next()) {
	    	System.out.println(r.getInt(1));
	    	System.out.println(r.getString(2));
	    	System.out.println(r.getInt(3));
	    	System.out.println("*********");
	    }
	    s.close();
	    con.close();
	
	}

}
