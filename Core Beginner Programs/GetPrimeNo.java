package fresherPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPrimeNo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("From Which no: ");
		int a = in.nextInt();
		System.out.println("To Which no:");
		int b = in.nextInt();
		int i = 2;
		ArrayList<Integer> prime = new ArrayList<>();
		for(int p=1; p<=b ; p++){
			i=2;
			for(; i<10; i++){
				if(p%i ==0 && p!=i){
					break;
				}
			}
			if(i==10){
				prime.add(p);
			}
		}
		System.out.println("prime no's: ");
		for(int j=0; j<prime.size(); j++){
			System.out.print(prime.get(j).toString() + ",");
		}
		
	}
}
