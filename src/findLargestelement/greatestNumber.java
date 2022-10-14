package findLargestelement;

import java.util.Scanner;

public class greatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 5, 10 ,15};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the nth largest number which you want to be find out!!");
        int n = scn.nextInt();
        if(n > arr.length ) {
            System.out.println("Nth Largest number not found in an array list !!");
    } else {
    	 System.out.println("Nth Largest number : "+greatest(arr, n));
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
		System.out.println(arr[i]);
		}
		return arr[n - 1];
    }
}
