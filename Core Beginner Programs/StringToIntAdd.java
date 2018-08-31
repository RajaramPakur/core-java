package fresherPrograms;

import java.util.Scanner;

public class StringToIntAdd {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number String");
		String a = in.next();
		System.out.println("Enter the second number String");
		String b = in.next();
		String[] arrayA = new String[200];
		String temp = null;
		String[] arrayB = new String[200];
		int c=0,d=0,r=0,sum=0;
		String total=null;
		
		for(int i=a.length()-1; i>=0; i--){
			
			 c = Integer.parseInt(String.valueOf(a.charAt(i)));
			 d = Integer.parseInt(String.valueOf(b.charAt(i)));
			 sum = c + d + r;
			 if(sum >= 10){
				 r=1;
				 
			 }
			
			 total = String.valueOf(sum);
			 
		}
		System.out.println(total);
		
		
	}
}
