package Assignments.week3;



public class APIClient {
	
//	String message;
//	String status;
//	boolean snap;
//	
	public void sendRequest (String endpoint) {
		
		System.out.println("Sending request to end point " + endpoint);
	}
	
	public void sendRequest (String endpoint, String requestbody, boolean requeststatus) {
		
		if (requeststatus==true)
			System.out.println(endpoint+ requestbody+ requeststatus);
		
	}
	
	public static void main(String[] args) {
		
		APIClient API = new APIClient ();
		
		API.sendRequest("Endpoint");
		API.sendRequest("Endpoint","requestbody",true);
	}
}




