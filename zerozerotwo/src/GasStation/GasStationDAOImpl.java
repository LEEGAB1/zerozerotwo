package GasStation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class GasStationDAOImpl implements GasStationDAO{

	@Override
	public List<String> gasStationSelect(Connection conn) {
		String sql = "select * from parkinglot";
		
		try(PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery())
		return null;
	}

	@Override
	public int gasStationSelectByStoreName(String storeName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gasStationUpdate(int price) {
		// TODO Auto-generated method stub
		return 0;
	}

}
