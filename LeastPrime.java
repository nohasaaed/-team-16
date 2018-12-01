import java.util.*;

public class SmallestPrimeNumber {
	public static ArrayList<Integer> primeArray = new ArrayList<Integer>();
	
	public static int getSmallestPrime(int arr[]){	 
		int returnValue = -1;
		int counter = 0;
		int temp;
		
		for(int i = 0; i < arr.length; i++){	
			for(int j = 2; j <= arr[i]/2; j++){
					temp = arr[i] % j;
					
					if(temp == 0 || arr[i] == 1 || arr[i] == 0){
						break;
					}
					else{
						
						counter++;
						primeArray.add(arr[i]);
					}	
					
			}
			if(arr[i] == 3 || arr[i] == 2){primeArray.add(arr[i]);}
		}
			Collections.sort(primeArray);
			if(counter != 0){
				returnValue = primeArray.get(0);
			}
			else if(counter == 0){
				returnValue = -1;
			}
		return returnValue;
	}
	
	
}
