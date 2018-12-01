/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;


/**
 *
 * @author note book
 */
public class Software {
	import java.util.Scanner;

	// Java Program to find largest 
		// prime factor of number 
		
		
		public class Find_largest_prime_num {
			public static int largestPrimeFactor(long number) {
		        int i;

		        for (i = 2; i <= number; i++) {
		            if (number % i == 0) {
		                number /= i;
		                i--;
		            }
		        }

		        return i;
		    }
			
			public static void main(String[] args) {
				Scanner input =new Scanner(System.in);
			long n ;
			n=input.nextLong();
				System.out.println(Find_largest_prime_num.largestPrimeFactor(n));
			}

			
		}

    /**
     * @param args the command line arguments
     */
    
    
	
    public static void main(String[] args) {
        // TODO code application  logic here
      
    }
    
}
