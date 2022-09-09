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
public class QuotientAndReminderProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter divisor and dividend to find quotinet and reminder");
		int dividend=input.nextInt();
		int divisor=input.nextInt();
		
		System.out.println("Quotient = "+dividend/divisor);
		System.out.println("Reminder = "+dividend%divisor);
	}

}
