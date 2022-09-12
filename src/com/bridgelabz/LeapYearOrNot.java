/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class LeapYearOrNot {

	/**
	 * @param args
	 */
	//Refactored leap year or not, power of 2
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter year");
		int year=input.nextInt();
		
		if(year>=1000 && year<=9999) {
			if(year%400==0 || year%4==0 && year%100!=0) {
				System.out.println(year+" is a leap year");
			}
			else {
				System.out.println(year+" is not a leap year");
			}
		}
		
		else {
			System.out.println("Enter 4 digit year");
		}
		
		input.close();

	}

}
