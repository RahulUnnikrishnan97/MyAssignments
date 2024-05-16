package Assignments.week3;

public class Inheritance_TestData {
	
	 public void enterCredentials() {
	     System.out.println("Entering Credentials");
	 }

	 public void navigateToHomePage() {
	     System.out.println("Navigating to home page");
	 }
	 
	 public static void main(String[] args) {
		
		 Inheritance_TestData td = new Inheritance_TestData();
		 td.enterCredentials();
		 td.navigateToHomePage();
	}
}
