import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Procedure2 {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databaseName=jdbc";
		try{
			Connection conn=DriverManager.getConnection(url,"sa","passw0rd");
			
			String sql="insert into playlists values('2016-12-25 13:00',1,'AÆU' )";
			CallableStatement cstmt=conn.prepareCall("");
			
			
					
		}

	}

}
