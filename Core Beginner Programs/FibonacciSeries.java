package fresherPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = in.nextInt();
		
		int n1=0, n2=1, n3=0;
		System.out.print(n1+" "+n2);
		for(int i=2; i<n; i++){
			//System.out.println(" " + fibonacci(i));
			
			n3=n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+ n3);
		}
	}
	
	public static int fibonacci(int i){
		
		if(i == 0){
			return 0;
		}
		if(i == 1){
			return 1;
		}
		return fibonacci(i-1) + fibonacci(i-2);
	}

}
