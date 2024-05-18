package Assignments.week3;

public class JavaConnectionAbstraction extends MySQLConnection {
	
	
	    @Override
	    public void executeQuery() {
	        // Implement query execution specific to JavaConnection
	        System.out.println("Executing query in JavaConnection");
	    }
	

	// Main class to test the implementation

	    public static void main(String[] args) {
	        // Instantiate the concrete class
	        JavaConnection connection = new JavaConnection();

	        // Call the methods defined in the interface and abstract class
	        connection.connect();
	        connection.executeUpdate();
	        connection.disconnect();
	    }
	}


