package week3.day2;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("connect");

	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeupdate");

	}
	
	public static void main(String[] args) {
		DatabaseConnection dbConnection = new JavaConnection();
		
		dbConnection.connect();
		dbConnection.disconnect();
		dbConnection.executeUpdate();
		

}
}

