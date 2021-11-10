package com.loel.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreparedStatementTest {
	static String url = "jdbc:mysql://localhost:3306/p2k_district?useSSL=false";// Make the database whatever name your
																				// database is all other keep the same
	static String user = "root";// Username to login into database default is root
	static String passwrd = "root";// Password to login in default is root
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static String name = "";

	public static void startDB() {
		try {
			// Connects to database
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, passwrd);
			;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static List<String> getUsername() {
		List<String> result = new ArrayList<String>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select username from user");
			while (rs.next()) {
				result.add(rs.getString(1));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		startDB();
		for(String st : getUsername()) {
			System.out.println(st);
		}
		
//		try
//
//		{
//			// Connects to database
////			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://192.168.1.1:3306/p2K_district?useSSL=false", "root",
//					"root");
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//		try {
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery("select username from user");
//			StringBuilder returnResults = new StringBuilder("");
//			while (rs.next()) {
//				returnResults.append(rs.toString());
//			}
//
//			System.out.println(returnResults.toString());
////			preparedStatement.setString(1, "loelloel");
////			preparedStatement.setString(2, "Loel");
////			preparedStatement.setString(3, "MN");
////			int row = preparedStatement.executeUpdate();
//
////			System.out.println(row);
//
//		} catch (SQLException e) {
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
