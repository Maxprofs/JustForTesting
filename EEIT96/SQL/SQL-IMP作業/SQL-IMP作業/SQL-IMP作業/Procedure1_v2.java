import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedure1_v2 {

	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=SQLIMP";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, "sa", "passw0rd");

			String sqlCmd = "insert into playlist values('2016-12-25 13:00',1,'A�U')";
			PreparedStatement pstmt = conn.prepareStatement(sqlCmd);
			pstmt.executeUpdate();

			String sqlCmd2 = "select seat_row,seat_col from m_room";
			PreparedStatement pstmt2 = conn.prepareStatement(sqlCmd2);
			ResultSet rs = pstmt2.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("seat_row"));
				System.out.println(rs.getString("seat_col"));
				break;
			}

			String sqlCmd1 = "insert into seats values('2016-12-25 13:00', 1, ?, '0', NULL)";
			for (int i = 1; i <= rs.getInt("seat_row"); i++) {
				for (int j = 1; j <= rs.getInt("seat_col"); j++) {
					String seatinput = String.format("%02d-%02d", i, j);
					PreparedStatement pstmt1 = conn.prepareStatement(sqlCmd1);
					pstmt1.setString(1, seatinput);
					pstmt1.executeUpdate();
				}
			}
			pstmt2.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
