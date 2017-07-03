import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Procedure2{

	public static void main(String[] args) {

		String url="jdbc:sqlserver://localhost:1433;databaseName=SQLIMP";
		try{
			Connection conn=DriverManager.getConnection(url,"sa","passw0rd");
			
			//String sql="insert into playlists values('2016-12-25 13:00',1,'A廳' )";
			CallableStatement cstmt=conn.prepareCall("{call gen_seats (?,?,?)}");
			cstmt.setString(1, "2016-12-25 13:00");
			cstmt.setInt(2, 1);
			cstmt.setString(3, "A廳" );
			cstmt.execute();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}