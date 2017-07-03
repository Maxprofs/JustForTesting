import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test4132 {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databaseName=SQLIMP";
		try{
			Connection conn=DriverManager.getConnection(url,"sa","passw0rd");
			
			//String sql="insert into playlists values('2016-12-25 13:00',1,'AÆU' )";
			CallableStatement cstmt=conn.prepareCall("{call gen_seats (?,?,?)}");
			cstmt.setString(1, "2016-12-25 13:00");
			cstmt.setInt(2, 1);
			cstmt.setString(3, "AÆU" );
			cstmt.execute();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}