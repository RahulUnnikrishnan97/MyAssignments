package Assignments.week3;

public class StringChangeOddIndex {
	
	 public static void main(String[] args) {
	        String text = "changeme";
	        //String[] words = text.split(" ");
	        //int count = 0;
	        char[] chars = text.toCharArray();
	        
	        for (int i = chars.length - 1; i >= 0; i--) {
	            if (i % 2 != 0) { // Check if index is odd
	                chars[i] = Character.toUpperCase(chars[i]);
	            }
	        }
	        
	        System.out.println(chars);
	    }
	
	        
	


}

