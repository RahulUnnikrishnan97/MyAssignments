package Assignments.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {
	
	public static void main(String[] args) {
        // Step 1: Declare and Initialize an Array
        Integer[] numbersArray = {1, 2, 3, 4, 10, 6, 8};
        
        // Step 2: Convert Array to List
        List<Integer> numbersList = new ArrayList<>();
        Collections.addAll(numbersList, numbersArray);
        
        // Step 3: Sort the List in Ascending Order
        Collections.sort(numbersList);
        
        // Step 4: Iterate and Check for Gaps
        System.out.print("Missing numbers: ");
        for (int i = 0; i < numbersList.size() - 1; i++) {
            int currentNumber = numbersList.get(i);
            int nextNumber = numbersList.get(i + 1);
            
            // If there is a gap between currentNumber and nextNumber
            while (currentNumber + 1 < nextNumber) {
                currentNumber++;
                System.out.print(currentNumber + " ");
            }
        }
    }
}


