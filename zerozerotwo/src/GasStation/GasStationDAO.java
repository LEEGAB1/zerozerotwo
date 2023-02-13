package GasStation;

import java.sql.Connection;
import java.util.List;

public interface GasStationDAO {
	
	List<GasStation> gasStationSelect(Connection conn);
	List<GasStation> gasStationSelectByStoreName(Connection conn, String storeName);
	int gasStationUpdate(Connection conn, GasStation gasstation);

}
