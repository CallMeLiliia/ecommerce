package io.duotech.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTEster {

	public static void main(String[] args) throws SQLException {
		
		String user = "admin";
		String password = "Lilia2020!";
		String url ="jdbc:mysql://database-1.c6snq7krtx8c.us-east-2.rds.amazonaws.com/employees";

	Connection connection=	DriverManager.getConnection(url, user, password);
	System.out.println("Data BAce connection has been established");
	Statement statement = connection.createStatement();
	ResultSet rs = statement.executeQuery("select * from employees limit 10");
//	rs.next();
	while(rs.next())
	//System.out.println(rs.getObject("first_name")+"\t"+ rs.getObject("last_name"));
		rs.getRow();
	
		
		
	}

}
