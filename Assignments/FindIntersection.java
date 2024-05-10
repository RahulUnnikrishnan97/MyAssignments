package Assignments;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int a [] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
		int len = a.length;
		int size = b.length;
		
		for(int i=0;i<len;i++) {
			
			for(int j=0;j<size;j++) {
				
				//System.out.println(+a[i]);
				//System.out.println(+b[j]);
			
			if(a[i]==b[j])
			{
				System.out.println("The Intersection are " +a[i]);
				break;
				
			}
			
			
			
			
		}
		
		
	}

	} }
