package fresherPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = in.next();
		String revSt = "";
		for(int i = st.length()-1; i>=0; i--){
			revSt = revSt + st.charAt(i);
		}
		System.out.println(st +  "  " + revSt);
		if(revSt.equals(st)){
			System.out.println("palindrom");
		}else{
			System.out.println("not");
		}
	}
}
