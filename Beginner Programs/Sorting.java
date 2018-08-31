package fresherPrograms;

import java.awt.DisplayMode;
import java.util.Scanner;

public class Sorting {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int temp=0;
		System.out.println("Enter the size of array");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the element for array");
		for(int i=0; i<size; i++){
			array[i] = in.nextInt();
		}
		display(array);
		
		for(int i=0; i<array.length ; i++){
			
			for(int j=i+1; j<array.length; j++){
				
				if(array[i] > array[j]){
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
					
				}
			}
		}
		System.out.println("Sorted element:");
		display(array);
		
		
		
	}
	
	static void display(int[] array){
		
		System.out.print("[ ");
		for(int i =0; i<array.length; i++)
		System.out.print(array[i] + "  ");
		System.out.println(" ]");
	}
	

}
