package userInfo;

import java.util.List;

public interface UserInfoService {
	int create(String id, String pw, String name);
	List<userInfo> read();
	int idCheck(String id);
	int nameCheck(String name);
	int delete(String id);
	
}
