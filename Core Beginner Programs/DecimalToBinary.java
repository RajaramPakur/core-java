package fresherPrograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the decimal integer");
		int a = in.nextInt();
		DecimalToBinary obj= new DecimalToBinary();
		obj.convertDecToBin(a);
//		System.out.println("Binary: " + Integer.toBinaryString(a));
		
		
	}
	
	private void convertDecToBin(int num){
		
		int[] binary = new int[100];
		int index = 0;
		while(num>0){
			binary[index++] = num%2;
			num = num/2;
		}
		for(int i=index-1; i>=0; i--){
			System.out.print(binary[i]);
		}
		
	}
}
