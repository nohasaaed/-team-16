/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.util.Arrays;

/**
 *
 * @author note book
 */
public class Software {

    /**
     * @param args the command line arguments
     */
    
    
	

	public static double GetMedian(int arr[]) {
		Arrays.sort(arr);
		double median;
		
		if (arr.length % 2 == 0)
		    median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
		else
		    median = (double) arr[arr.length/2];
		
		return median;
	}

    public static void main(String[] args) {
        // TODO code application  logic here
    }
    
}
