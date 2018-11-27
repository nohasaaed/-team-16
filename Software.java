/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author note book
 */
public class Software {

    /**
     * @param args the command line arguments
     */
     
	public static int GetMedian(int arr[]) {
		int median = -1;
		Arrays.sort(arr);
		
		if (arr.length % 2 == 0)
		    median = (arr[arr.length/2] + arr[arr.length/2 - 1])/2;
		else
		    median = (arr[arr.length/2]);
		
		return median;
	}
	
	
	
	public static void main(String[] args) {
        // TODO code application logic here
		
    }
	
    
}
