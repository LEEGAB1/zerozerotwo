package userInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInfoDAOImpl implements UserInfoDAO{

	@Override
	public int UserInfoSelectId(Connection conn, String id) {
		String sql = "select * from user_info where id = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, id);
			
			return stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("DB id 조회중에 오류가 발생했습니다.", e);
		}
	}

	@Override
	public int UserInfoSelectName(Connection conn, String name) {
		String sql = "select * from user_info where nickname = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, name);
			
			return stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("DB nickname 조회중에 오류가 발생했습니다.", e);
		}
	}

	@Override
	public int InsertUserInfo(Connection conn, String id, String pw, String name) {
		String sql = "insert into user_info (id, password, nickname) " + "values(?, ?, ?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, id);
			stmt.setString(2, pw);
			stmt.setString(3, name);
			
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("userinfo 등록중에 오류가 발생했습니다.", e);
		}
	}


}
