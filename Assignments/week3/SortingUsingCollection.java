package Assignments.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	 public static void main(String[] args) {
	        // Step 1: Declare and Initialize a String Array
	        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
	        
	        // Step 2: Convert Array to List
	        List<String> companyList = new ArrayList<>();
	        Collections.addAll(companyList, companies);
	        
	        // Step 3: Sort the List in Ascending Order
	        Collections.sort(companyList);
	        
	        // Step 4: Iterate in Reverse Order and Print the Values
	        for (int i = companyList.size() - 1; i >= 0; i--) {
	            System.out.print(companyList.get(i));
	            if (i != 0) {
	                System.out.print(", ");
	            }
	        }
	    }
	

}
