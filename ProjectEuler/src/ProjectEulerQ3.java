/**
 * 
 * 
 * 	Largest prime factor
	Problem 3
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
 * 
 * 
 * 
 * 
 * @author Nicholas
 *
 */
import java.util.*;	
		
public class ProjectEulerQ3 {

	public static void main(String[] args) {
		
		largestPrimeFac();
	}
	
	
	/**
	 * This solution works by taking the "target" number, and diving it down to find the smallest
	 * factor of a number.  Once the smallest factor of a number
	 * is that number, that is the greatest prime factor. 
	 */
	public static void largestPrimeFac(){
		
		long largestPrimeFac = 2;
		long targetNum = 600851475143L;
		
		while (targetNum > largestPrimeFac){
			if (targetNum%largestPrimeFac == 0){
				targetNum = targetNum/largestPrimeFac;
					largestPrimeFac = 2;
					
			} else {
				largestPrimeFac += 1;
				
			}
			
		}
	
		System.out.println("Largest Prime Factor is" + largestPrimeFac);
	}

}
