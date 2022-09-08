/**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
public class CoinFlips {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int headCount=0, tailCount=0;
		int iter=10;
		for(int i=0;i<iter;i++) {
			int flip = r.nextInt(2);
			if(flip==0) {
				headCount++;
			}
			else {
				tailCount++;
			}
		}
				
		System.out.println("Percentage of head = "+ (float)headCount*100/iter);
		System.out.println("Percentage of tail = "+ (float)tailCount*100/iter);

	}

}
