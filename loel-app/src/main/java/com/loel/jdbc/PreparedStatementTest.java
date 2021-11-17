package com.loel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementTest {

	public static void main(String[] args) {
		// try with resource
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/octbatch", "root", "root");
				PreparedStatement preparedStatement = conn.prepareStatement("UPDATE EMP SET EADDRESS=? WHERE ENO=?");) {

			preparedStatement.setString(1, "SanJose");
			preparedStatement.setInt(2, 4);
			int row = preparedStatement.executeUpdate();

			System.out.println(row); // 1

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}