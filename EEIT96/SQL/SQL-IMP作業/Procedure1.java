import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Procedure1 {


	public static void main(String[] args) {
		Connection conn=null;
		String sqlCmd="insert into playlist values('2016-12-25 13:00',1,'AÆU')";
		String sqlCmd1="update table seats set ptime=?,movie=?,seat_num=?,sold=?,ordid=?";
		String url="jdbc:sqlserver://localhost:1433;databaseName=jdbc";
				try{
			conn=DriverManager.getConnection(url,"sa","passw0rd");
			
			PreparedStatement pstmt=conn.prepareCall(sqlCmd);
			pstmt.executeUpdate();
			
			//connect for update & while loops to generate seats
			
			
			if(@_roomid='AÆU')
				begin
				set @v_row=25;
				set @v_col=20;
				end;

				if(@_roomid='BÆU')
				begin
				set @v_row=20;
				set @v_col=20;
				end;

				if(@_roomid='CÆU')
				begin
				set @v_row=15;
				set @v_col=15;
				end;

				begin
				set @x_row=1;
				while(@x_row<=@v_row)
				begin
				set @x_col=1;
				while (@x_col <=@v_col)
				begin 
				insert into seats 
				values(@v_ptime,@v_movie,cast(@x_row as varchar(5))+'-'+cast(@x_col as varchar(5)),'0',null);
				set @x_col+=1;
				end;
				set @x_col=1;
				set @x_row+=1;
				end;
				end;
				end;

			
		}

	}

}
