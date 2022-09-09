/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class HarmonicNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=input.nextInt();
		double harmonic=0;
		
		if(n!=0) {
			for(int i=1;i<=n;i++) {
				harmonic+= (double)1/i;
			}
		}
		
		System.out.println("Result og harmonic number = "+harmonic);
		
	}

}
