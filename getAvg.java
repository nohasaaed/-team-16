package getAvg;

import java.util.Scanner;

public class Avg {
	
	
	
	public static void getAvg(double[] arr)
	{
		
	double tut = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			tut+=arr[i];
		}
		
		double avg = tut/arr.length;
		
		System.out.println("Avg of data entered = " + avg);
		
	}
	
	public static void main(String[] args) {
		System.out.println("how many numbers you'll add?");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //size
		
		double[]  arr = new double[num];
		
		for(int i=0; i<arr.length; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	arr[i] = sc.nextDouble();
        }
		
		getAvg(arr);
		
	}

}
