package fresherPrograms;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the binary no;");
		int binary = in.nextInt();
		int tempBinary = binary;
		
		int power =0, decimal =0;
		
		while(true){
			
			if(binary == 0){
				break;
			}else{
				
				int temp = binary%10;
				decimal += temp*Math.pow(2, power);
				power++;
				binary = binary/10;
			}
		}
		System.out.println("Binary : " + tempBinary + " Decimal : " + decimal);
		
	}

}
