package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingValuesthroughpreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
		PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
		ps.setInt(1, 7);
		ps.setString(2, "anu");
		ps.setInt(3, 25);
		int k=ps.executeUpdate();
		System.out.println(k);

	}

}
