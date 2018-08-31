package fresherPrograms;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the no for factorial: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int fact = 1;
		for(int i=a; i>1; i--){
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+ a + " is :" + fact);
		
	}
}
