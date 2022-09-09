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
		
		if(number>=0 && number<=31) {
			for(int i=1;i<=number;i++) {
				System.out.println((int) Math.pow(2, i));
			}
		}
		else {
			System.out.println("Enter valid value of number");
		}
		
	}

}
