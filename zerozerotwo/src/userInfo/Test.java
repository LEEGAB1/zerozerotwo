package userInfo;

import java.sql.Connection;
import java.sql.SQLException;

import zerozerotwo.dbutil.ConnectionProvider;

public class Test {
	private static Connection conn;
	private static UserInfoDAO dao;
	public static void main(String[] args) throws SQLException {
		dao = new UserInfoDAOImpl();
		conn = ConnectionProvider.getConnection();
		
	
		System.out.println(dao.InsertUserInfo(conn, "jinju", "jinju", "jinju"));
		
		
		
	}
}
