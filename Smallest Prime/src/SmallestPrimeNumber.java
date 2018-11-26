import java.lang.*;
import java.util.*;
public class SmallestPrimeNumber {
	static ArrayList<Integer> primeArray = new ArrayList<Integer>();
	public static boolean checkPrime(int arrayOfNumbers[]){
		boolean prime = true;
		for(int i = 0; i < arrayOfNumbers.length; i++){
			if(arrayOfNumbers[i] > 0){
				for(int j = 1; i <= 2; i++){
					if(arrayOfNumbers[i] != j){
						if(arrayOfNumbers[i] % j == 0){
							prime = false;
						}
						else{
							prime = true;
							primeArray.add(arrayOfNumbers[i]);
						}
					}
				}
			}
			System.out.println(primeArray.get(i));
		}
		return prime;
	}
	public static void main(String args[]){
		int arr[] = {1, 2, 4, 123, 3 , 334, 12, 23, 6, 7, 8, 33, 44};
		checkPrime(arr);
	}
}
