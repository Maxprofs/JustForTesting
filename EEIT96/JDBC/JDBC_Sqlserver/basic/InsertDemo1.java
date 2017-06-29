package com.iii.eeit96.joe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

// Insert one employee
public class InsertDemo1 {
	public static void main(String[] args) {
		Connection conn = null;

//		LocalDate today = LocalDate.now();
//		String input = today.toString();

		try {
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=jdbc";
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");

			String insStmt = "INSERT INTO employee VALUES (?, ?, getdate(), ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(insStmt);
			pstmt.setInt(1, 1009);
			pstmt.setString(2, "Jean Tsao");
//			pstmt.setString(3, input);

			pstmt.setDouble(4, 55000);
			pstmt.setInt(5, 100);
			pstmt.setString(6, "senior engineer");

			int num = pstmt.executeUpdate();
			System.out.println("insert count = " + num);

			pstmt = conn.prepareStatement("SELECT * FROM employee");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.print("name = " + rs.getString("ename") + ", ");
				System.out.println("salary = " + rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}// end of main()
}// end of class InsertDemo
