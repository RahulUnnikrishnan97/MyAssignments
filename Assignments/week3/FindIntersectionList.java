package Assignments.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {
	
	public static void main(String[] args) {
        // Step 1: Declare and Initialize the Arrays
        Integer[] array1 = {3, 2, 11, 4, 6, 7};
        Integer[] array2 = {1, 2, 8, 4, 9, 7};
        
        // Step 2: Convert Arrays to Lists
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        
        // Step 3: Find Intersection
        List<Integer> intersection = new ArrayList<>();
        for (Integer num : list1) {
            if (list2.contains(num)) {
                intersection.add(num);
            }
        }
        
        // Step 4: Print Common Values
        System.out.println("Common values: " + intersection);
    }
}


