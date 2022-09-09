/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
public class PrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number to find prime factors");
		int number=input.nextInt();
		
		System.out.println("Prime factors of "+number);	
		for(int i=2; i*i<number; i++) {
			while(number%i ==0) {
				System.out.println(i);
				number=number/i;
			}
		}
		
		if(number>2) {
			System.out.println(number);
		}

	}

}
