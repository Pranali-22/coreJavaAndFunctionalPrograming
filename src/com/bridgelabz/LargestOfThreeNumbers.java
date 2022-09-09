/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class LargestOfThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three numbers to find largest number");
		int number1=input.nextInt();
		int number2=input.nextInt();
		int number3=input.nextInt();
		int max;
		
		if(number1 > number2 && number1 > number3) {
			max=number1;
		}else if(number2 > number1 && number2 > number3) {
			max=number2;
		}else {
			max= number3;
		}
		
		System.out.println("Largest number among "+number1+", "+number2+" and "+number3+" = "+max);
	}

}
