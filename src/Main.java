import singleton.Singleton;

public class Main {
	
	Singleton connection = Singleton.getInstance();
	
	Singleton connection2 = Singleton.getInstance();
	
	public Main() {
		connection.printData();
		connection2.printData();
		
		connection.setDb_name("HALOHALO");
		
		connection2.printData();
		
		if(connection == connection2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
