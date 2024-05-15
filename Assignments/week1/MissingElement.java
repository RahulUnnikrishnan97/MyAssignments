package Assignments.week1;

import java.util.Arrays;

public class MissingElement {
	
	public static void main(String[] args) {
		
		int[] nums = {1,4,3,2,8,6,7};
		
 		Arrays.sort(nums);
		// [1,2,3,4,6,7,8]
		
		for (int i=1;i<nums.length;i++) {
			if (nums[i-1]!=i) {
				System.out.println("print missing numbers " +i);
				break;
			
			}
			
		}
		
	}
}


