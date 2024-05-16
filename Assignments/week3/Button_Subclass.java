package Assignments.week3;

public class Button_Subclass extends WebElement_Baseclass {
	
	 public void submit() {
	     System.out.println("Submitting the Application");
	 }

	 public static void main(String[] args) {
		
		 Button_Subclass button = new Button_Subclass();
		 
		 button.submit();
		 button.click();
		 button.setText("Passing String");
	}
}
