package Assignments.week3;

public class Subclass1 extends Inheritance_TestData {
	
	 public void enterUserName() {
	     System.out.println("Entering Username...");
	     
	     
	 }
	 
	 public void enterPassword() {
	     System.out.println("Entering Password...");
	 }
	 
	 public static void main(String[] args) {
		
		 Subclass1 subclass = new Subclass1 ();
		 
		 subclass.enterCredentials ();
		 subclass.enterPassword();
		 subclass.navigateToHomePage();
		 subclass.enterUserName();
		 
	}

}
