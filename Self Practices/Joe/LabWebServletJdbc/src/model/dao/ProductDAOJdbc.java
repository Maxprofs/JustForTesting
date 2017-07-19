package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.ProductBean;
import model.ProductDAO;

public class ProductDAOJdbc implements ProductDAO {
	private static final String URL = "jdbc:sqlserver://localhost:1433;database=java";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "passw0rd";

	public static void main(String[] args) {
		ProductDAOJdbc dao=new ProductDAOJdbc();
		ProductBean bean=new ProductBean();
		java.util.Date date=new java.util.Date();
		bean.setId(20);
		bean.setName("Pie");
		bean.setMake(date);
		bean.setExpire(35);
		bean.setPrice(25);
		
		dao.insert(bean);		
		System.out.println(dao.select(20));
		dao.update("Rice cake", 40,date, 10, 20);
		System.out.println(dao.select(20));
		dao.delete(20);
		System.out.println(dao.select());
		
	}

	private static final String SELECT_BY_ID = "select * from product where id=?";

	@Override
	public ProductBean select(int id) {
		ProductBean result = null;

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(SELECT_BY_ID);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				result=new ProductBean();
				result.setId(id);
				result.setName(rs.getString("NAME"));
				result.setPrice(rs.getDouble("PRICE"));
				result.setMake(rs.getDate("MAKE"));
				result.setExpire(rs.getInt("EXPIRE"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private static final String SELECT_ALL = "select * from product";

	@Override
	public List<ProductBean> select() {
		List<ProductBean> result = new ArrayList<ProductBean>();
		ProductBean bean=null;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				bean=new ProductBean();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setPrice(rs.getDouble("PRICE"));
				bean.setMake(rs.getDate("MAKE"));
				bean.setExpire(rs.getInt("EXPIRE"));
				result.add(bean);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private static final String INSERT = "insert into product (id, name, price, make, expire) values (?, ?, ?, ?, ?)";

	@Override
	public ProductBean insert(ProductBean bean) {
		ProductBean result = null;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(INSERT);
			stmt.setInt(1, bean.getId());
			stmt.setString(2,bean.getName());
			stmt.setDouble(3, bean.getPrice());
			
			Long temp=bean.getMake().getTime();
			java.sql.Date temp1=new java.sql.Date(temp);
			stmt.setDate(4,temp1);
			stmt.setInt(5, bean.getExpire());
			
			 stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private static final String UPDATE = "update product set name=?, price=?, make=?, expire=? where id=?";

	@Override
	public ProductBean update(String name, double price, java.util.Date make, int expire, int id) {
		ProductBean result = null;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(UPDATE);
			stmt.setString(1, name);
			stmt.setDouble(2, price);
			
			Long temp=make.getTime();
			java.sql.Date temp1=new java.sql.Date(temp);
			stmt.setDate(3, temp1);
			stmt.setInt(4, expire);
			stmt.setInt(5, id);
			
			stmt.executeUpdate();
			 
			 final String checkUpdate="SELECT * FROM PRODUCT WHERE ID="+id;
			 Statement stmt1=conn.createStatement();
			 ResultSet rs=stmt1.executeQuery(checkUpdate);
			 if(rs.next()){
				 result=new ProductBean();
				 result.setId(id);
				 result.setName(rs.getString("NAME"));
				 result.setPrice(rs.getDouble("PRICE"));
				 result.setMake(rs.getDate("MAKE"));
				 result.setExpire(rs.getInt("EXPIRE"));
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	private static final String DELETE = "delete from product where id=?";

	@Override
	public boolean delete(int id) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(DELETE,Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			if(stmt.getGeneratedKeys()!=null){
				return true;
			};
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}
}
