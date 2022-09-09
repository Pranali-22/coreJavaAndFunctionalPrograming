/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
public class SwapNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int number1=input.nextInt();
		int number2=input.nextInt();
		
		System.out.println("Numbers before swap \nNumber1 = "+number1+"\nNumber2 = "+number2);
		
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;

		System.out.println("Numbers after swap \nNumber1 = "+number1+"\nNumber2 = "+number2);
		
	}

}
