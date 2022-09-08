/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import java.math.*;
/**
 * @author Dell
 *
 */
public class CalculatePowerOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int number=input.nextInt();
		
		System.out.println("Power of 2 of "+ number + " = "+ Math.pow(number, 2));
	}

}
