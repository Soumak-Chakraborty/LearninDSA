package findLargestelement;

import java.util.Scanner;

public class divisionWithoutUsingOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend, divisor, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dividend value here:");
		dividend = sc.nextInt();
		System.out.println("Enter the divisor value here:");
		divisor = sc.nextInt();
		
		System.out.println("The Result is : "+divideWithoutUsingOperator(dividend, divisor));
	}
	
	public static int divideWithoutUsingOperator( int dividend , int divisor) {
		int sign = ((dividend < 0) && (divisor > 0)) || ((dividend > 0) && (divisor < 0)) ? -1 : 1;
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		int quotient = 0;
		while(dividend >= divisor) {
			dividend -= divisor;
			quotient++;
		}
		return quotient * sign;
	}

}
