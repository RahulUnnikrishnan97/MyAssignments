package Assignments.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestList {
	public static void main(String[] args) {
        // Step 1: Declare and Initialize an Array
        Integer[] numbersArray = {3, 2, 11, 4, 6, 7};
        
        // Step 2: Convert Array to List
        List<Integer> numbersList = new ArrayList<>();
        Collections.addAll(numbersList, numbersArray);
        
        // Step 3: Sort the List in Ascending Order
        Collections.sort(numbersList);
        
        // Step 4: Retrieve and Print the Second Largest Element
        int secondLargest = numbersList.get(numbersList.size() - 2);
        System.out.println("The second largest number is: " + secondLargest);
    }
}


