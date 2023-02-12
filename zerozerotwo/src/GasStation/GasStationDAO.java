package GasStation;

import java.util.List;

public interface GasStationDAO {
	
	List<String> gasStationSelect();
	int gasStationSelectByStoreName(String storeName);
	int gasStationUpdate(int price);

}
