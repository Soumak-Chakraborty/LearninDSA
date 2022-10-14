package findLargestelement;

import java.util.Arrays;
import java.util.Scanner;

public class findLargestElementduplicatevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int [] arr = {1, 5, 5, 10 , 10, 15, 15 };
      int [] arr = {15, 15, 10, 10, 5, 5, 1};
		
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the nth largest number which you want to be find out!!");
      int n = sc.nextInt();

      int[] temp = new int[arr.length];
      int i=0, k = 0, j = 0;
      
		for(i=0; i<arr.length-1; i++){
		if(arr[i] != arr[i+1]){
		temp[j++] = arr[i];
		}
		}
		temp[j++] = arr[arr.length-1];
		
		//Changing the original array
		for(k=0; k<j; k++){
		System.out.println(temp[k]);
		}
		
		if(n > arr.length ) {
            System.out.println("Nth Largest number not found in an array list !!");
         } else {
    	System.out.println("Nth Largest number : "+greatest(temp, n));
       } 
	}
	   
	    public static int greatest(int [] arr, int n)
	    {
	    	int i, j;
			for(i = 0; i<arr.length -1; i++) {
				for(j = 0; j < arr.length - i - 1; j++) {
					if(arr[j]<arr[j+1]) {
						
						int temp = arr[j];
						arr[j]= arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			
			for(i = 0; i < arr.length; i++) {
				 System.out.println("item"+arr[i]);
			}
			return arr[n - 1];
    }
	    
}
