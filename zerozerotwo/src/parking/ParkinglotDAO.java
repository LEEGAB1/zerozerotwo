package parking;

import java.util.List;

public interface ParkinglotDAO {
	List<String> parkinglotSelect();
	int parkinglotselectByStoreName(String storeName);
	int parkinglotUpdate(int price);
	
}
