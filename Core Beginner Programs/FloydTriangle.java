package fresherPrograms;

import java.util.Scanner;

public class FloydTriangle {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of row:");
		int a = in.nextInt();
		int n =0;
		for(int i = 0; i<a; i++){
			for(int j = 0; j<=i ; j++){
				System.out.print(++n + " ");
			}
			System.out.println();
		}
	}

}
