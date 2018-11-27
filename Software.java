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

    /**
     * @param args the command line arguments
     */
    
    
	public static double getAvg(double[] arr)
	{
		
	double tut = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			tut+=arr[i];
		}
		
		double avg = tut/arr.length;
		
		return avg;
		
	}
    public static void main(String[] args) {
        // TODO code application logic here
      
    }
    
}
