package com.iii.eeit96.dynamicorc72;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedure1 {

	public static void main(String[] args) {
		
		final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=SQLIMP";
		
		try {
			Class.forName(DB_DRIVER);
			
			Connection conn = DriverManager.getConnection(DB_URL, "sa", "passw0rd");
			
			String sqlCmd = "INSERT INTO playlist VALUES ('2016-12-25 13:00', 1, 'A�U')" ;
			
			PreparedStatement pstmt = conn.prepareStatement(sqlCmd);
			
			pstmt.executeUpdate();
			
			String sqlCmdq = " SELECT seat_row, seat_col FROM m_room";
			
			PreparedStatement pstmtq = conn.prepareStatement(sqlCmdq);
			
			ResultSet rs = pstmtq.executeQuery();
		
			while(rs.next()){
				System.out.println(rs.getString("seat_row"));
				System.out.println(rs.getString("seat_col"));
				break;
			}
			
			
			String sqlCmdins = " INSERT INTO seats VALUES ('2016-12-25 13:00', 1, ?, '0', NULL)";
			for(int x = 1 ; x <= rs.getInt("seat_row"); x++){
				for(int y = 1 ; y <= rs.getInt("seat_col"); y++){
					String seatinput = String.format("%02d-%02d", x, y);
					PreparedStatement pstmtqins = conn.prepareStatement(sqlCmdins);
					pstmtqins.setString(1, seatinput);
					pstmtqins.executeUpdate();
			 }
			} 
			
			pstmtq.close();
			pstmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}