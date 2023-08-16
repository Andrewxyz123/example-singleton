package singleton;

public class Singleton {
	private static Singleton instance;
	
	private String ipAddress;
	private String db_name;
	
	private Singleton() {
		this.ipAddress = "192.168.1.1";
		this.db_name = "DB_TEST";
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void printData() {
		System.out.println("The IP of "+this.db_name+" is : "+ this.ipAddress);
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getDb_name() {
		return db_name;
	}

	public void setDb_name(String db_name) {
		this.db_name = db_name;
	}
	
	
	
}
