package Assignments.week3;

public class JavaConnection implements DatabaseConnection {
	
	 @Override
	    public void connect() {
	        // Implement connection logic
	        System.out.println("Connected to the database");
	    }

	    @Override
	    public void disconnect() {
	        // Implement disconnection logic
	        System.out.println("Disconnected from the database");
	    }

	    @Override
	    public void executeUpdate() {
	        // Implement execute update logic
	        System.out.println("Executing update in the database");
	    }
	

	// Main class to test the implementation
	
	    public static void main(String[] args) {
	        // Instantiate the concrete class
	        JavaConnection connection = new JavaConnection();

	        // Call the methods defined in the interface
	        connection.connect();
	        connection.executeUpdate();
	        connection.disconnect();
	    }

}
