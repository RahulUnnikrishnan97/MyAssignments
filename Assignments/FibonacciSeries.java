package Assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1;
		int [] array = {0,1};
		System.out.println("Fibonacci series:"); 
		System.out.println(+a);
		System.out.println(+b);
		for (int i=2;i<n; i++) {
			int c = a+b;
			System.out.println(+c);
			a = b;
			b = c;
		}

	}
	
		
	}

