package com.loel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementQueryTest {

    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/octbatch", "root", "root");
                PreparedStatement preparedStatement = conn.prepareStatement("select *from emp");) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int eno = rs.getInt(1);
                String ename = rs.getString(2);
                String eaddress = rs.getString(3);
                System.out.println(eno + ename + eaddress);
            }
        }

    }
}