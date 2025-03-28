package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletevaluesUsingDependencies {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
        Statement s=con.createStatement();
        int k=s.executeUpdate("delete from emp where eno=7");
        System.out.println(k);
        s.close();
        con.close();
	}

}
