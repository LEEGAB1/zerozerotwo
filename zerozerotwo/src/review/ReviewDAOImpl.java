package review;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class ReviewDAOImpl implements ReviewDAO{

	@Override
	public List<Review> reviewSelect(Connection conn) {
		return null;
	}

	@Override
	public List<Review> reviewSelectByStoreName(Connection conn) {
		return null;
	}

	@Override
	public List<Review> reviewSelectBynickname(Connection conn) {
		return null;
	}

	@Override
	public int reviewdelete(Connection conn) {
		return 0;
	}

	@Override
	public int reviewInsert(Connection conn) {
		return 0;
	}

	private Review resultMapping(ResultSet rs) throws SQLException {
		
	}

}
