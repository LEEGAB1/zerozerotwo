package userInfo;

import java.sql.Connection;

public interface UserInfoDAO {
	int UserInfoSelectId(Connection conn, String id);
	int UserInfoSelectName(Connection conn, String name);
	int InsertUserInfo(Connection conn, String id, String pw, String name);
}
