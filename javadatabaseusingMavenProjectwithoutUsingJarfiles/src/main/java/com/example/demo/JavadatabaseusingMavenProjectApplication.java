package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavadatabaseusingMavenProjectApplication {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Root@123");
		    Statement s=con.createStatement();
		    int k =s.executeUpdate("insert into emp values(6,'mani',24)");
		    System.out.println(k);
		    s.close();
		    con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
