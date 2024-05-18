package Assignments.week3;

abstract class MySQLConnection implements DatabaseConnection  {
	
	
	    @Override
	    public void connect() {
	        // Implement connection logic specific to MySQL
	        System.out.println("Connected to MySQL database");
	    }

	    @Override
	    public void disconnect() {
	        // Implement disconnection logic specific to MySQL
	        System.out.println("Disconnected from MySQL database");
	    }

	    @Override
	    public void executeUpdate() {
	        // Implement update logic specific to MySQL
	        System.out.println("Executing update in MySQL database");
	    }

	    // Abstract method specific to MySQL for executing queries
	    abstract void executeQuery();
	}


