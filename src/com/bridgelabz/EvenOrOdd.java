/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number to check even or odd");
		int number=input.nextInt();
		
		if(number%2==0) {
			System.out.println(number+" is even number");
		}
		else{
			System.out.println(number+" is odd number");
		}
		input.close();

	}

}
