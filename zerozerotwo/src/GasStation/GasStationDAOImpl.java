package GasStation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GasStationDAOImpl implements GasStationDAO{

	@Override
	public List<GasStation> gasStationSelect(Connection conn) {
		String sql = "SELECT * FROM gas_station";
		
		try(PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {
			List<GasStation> list = new ArrayList<>();
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("주유소 총 조회 작업 중 예외 발생", e);
		}
	}


	@Override
	public List<GasStation> gasStationSelectByStoreName(Connection conn, String storeName) {
		String sql = "SELECT * FROM gas_station WHERE storeName LIKE '%?%'";
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, storeName);
			
			try(ResultSet rs = stmt.executeQuery()) {
				List<GasStation> list = new ArrayList<>();
				while(rs.next()) {
					list.add(resultMapping(rs));
				}
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("주유소 선별조회 작업 중 예외 발생", e);
		}
	}

	@Override
	public int gasStationUpdate(Connection conn, GasStation gasstation) {
		String sql = "UPDATE gas_station SET p_gasoline=?, gasoline=?, diesel =?";
		
		try(PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, gasstation.getP_gasoline());
			stmt.setInt(2, gasstation.getGasoline());
			stmt.setInt(3, gasstation.getDiesel());
			
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("주유소 수정 작업 중 예외 발생", e);
		}
	}
	
	private GasStation resultMapping(ResultSet rs) throws SQLException{
		GasStation gasstation = new GasStation();
		gasstation.setStorename(rs.getString("storename"));
		gasstation.setStoreaddress(rs.getString("storeaddress"));
		gasstation.setStorenumber(rs.getString("storenumber"));
		gasstation.setStorebrand(rs.getString("storebrand"));
		gasstation.setSelf(rs.getString("self"));
		gasstation.setP_gasoline(rs.getInt("p_gasoline"));
		gasstation.setGasoline(rs.getInt("gasoline"));
		gasstation.setDiesel(rs.getInt("diesel"));
		gasstation.setX(rs.getString("X"));
		gasstation.setY(rs.getString("Y"));
		
		return gasstation;
		
	}

}
