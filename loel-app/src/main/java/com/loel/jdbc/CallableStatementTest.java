package com.loel.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementTest {
	// CallableStatement is used for calling Stored Procedures like
	// Procedures,Function,Trigger,Cursors
	public static void main(String[] args) throws SQLException {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/octbatch", "root", "root");
				CallableStatement callableStatement = conn.prepareCall("{ call insert_emp(?,?,?) }")) {
			callableStatement.setInt(1, 8);
			callableStatement.setString(2, "Luis");
			callableStatement.setString(3, "Monroville");

			int row = callableStatement.executeUpdate();
			System.out.println(row);
		}
	}
} 