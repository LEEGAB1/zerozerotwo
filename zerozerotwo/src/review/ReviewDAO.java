package review;

import java.sql.Connection;
import java.util.List;

public interface ReviewDAO {
	// 파라미터값 생각해보기
	List<Review> reviewSelect(Connection conn);
	List<Review> reviewSelectByStoreName(Connection conn);
	List<Review> reviewSelectBynickname(Connection conn);
	int reviewdelete(Connection conn);
	int reviewInsert(Connection conn);
	
}
