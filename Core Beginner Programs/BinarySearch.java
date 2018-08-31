package fresherPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the element");
		
		for(int i = 0; i<size ; i++){
			array[i] = in.nextInt();
		}
		
		System.out.println("Enter the search element");
		int s = in.nextInt();
		
		Arrays.sort(array);
		int first, last, middle;
		first = 0;
		last = size-1;
		middle = (first + last)/2;
		int i=0;
		for(; i<size; i++){
			if(s < array[middle]){
				last = middle-1;
			}else if(s > array[middle]){
				first = middle + 1;
			}else{
				System.out.println("element " + s + "is found");
				break;
			}
			
			middle = (first+last)/2;
		}
		if( i == size){
			System.out.println("not found");
		}
		
		
	}
	
}
