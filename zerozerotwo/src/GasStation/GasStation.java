package GasStation;

public class GasStation {
	private String storename;
	private String storeaddress;
	private String storenumber;
	private String storebrand;
	private String self;
	private int p_gasoline;
	private int gasoline;
	private int diesel;
	private String X;
	private String Y;
	
	public GasStation() {
		super();
	}

	public GasStation(String storename, String storeaddress, String storenumber, String storebrand, String self,
			int p_gasoline, int gasoline, int diesel, String x, String y) {
		super();
		this.storename = storename;
		this.storeaddress = storeaddress;
		this.storenumber = storenumber;
		this.storebrand = storebrand;
		this.self = self;
		this.p_gasoline = p_gasoline;
		this.gasoline = gasoline;
		this.diesel = diesel;
		X = x;
		Y = y;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStoreaddress() {
		return storeaddress;
	}

	public void setStoreaddress(String storeaddress) {
		this.storeaddress = storeaddress;
	}

	public String getStorenumber() {
		return storenumber;
	}

	public void setStorenumber(String storenumber) {
		this.storenumber = storenumber;
	}

	public String getStorebrand() {
		return storebrand;
	}

	public void setStorebrand(String storebrand) {
		this.storebrand = storebrand;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public int getP_gasoline() {
		return p_gasoline;
	}

	public void setP_gasoline(int p_gasoline) {
		this.p_gasoline = p_gasoline;
	}

	public int getGasoline() {
		return gasoline;
	}

	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}

	public int getDiesel() {
		return diesel;
	}

	public void setDiesel(int diesel) {
		this.diesel = diesel;
	}

	public String getX() {
		return X;
	}

	public void setX(String x) {
		X = x;
	}

	public String getY() {
		return Y;
	}

	public void setY(String y) {
		Y = y;
	}

	@Override
	public String toString() {
		return "GasStation [storename=" + storename + ", storeaddress=" + storeaddress + ", storenumber=" + storenumber
				+ ", storebrand=" + storebrand + ", self=" + self + ", p_gasoline=" + p_gasoline + ", gasoline="
				+ gasoline + ", diesel=" + diesel + ", X=" + X + ", Y=" + Y + "]";
	}

	
	
	
	

}
