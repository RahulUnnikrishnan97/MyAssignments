package Assignments.week3;

public class TextField_Subclass extends WebElement_Baseclass {
	
	 public void getText() {
	     System.out.println("Getting the text");
	 }
	 
	 public static void main(String[] args) {
		
		 TextField_Subclass text = new TextField_Subclass();
		 text.getText();
		 text.click();
		 text.setText("String passed");
		 
	}

}
