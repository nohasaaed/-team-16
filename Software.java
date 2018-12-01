package software;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;

public class Software {

    static void get_max_numbers(int arr[], int len) {
        int first = 0, second = 0, third = 0;
        if (len < 3) {
            System.out.println("Not valid input");
        } else {

            for (int i = 0; i < len; i++) {
                if (arr[i] > first) {
                    third = second;
                    second = first;
                    first = arr[i];

                } else if (arr[i] > second) {
                    third = second;
                    second = arr[i];

                } else if (arr[i] > third) {
                    third = arr[i];
                }
            }
        }
        System.out.println("first number: " + first +"\nSecond Number: " + second + "\nThird Number: " + "Third");
    }


    	public static void isPalindrom() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter word to check if it is palindrom: ");
		String word = s.nextLine();
		char[] text = word.toCharArray();
		boolean isIt = false;
		for (int i = 0; i <= (text.length / 2) - 1; i++) {
			if (text[i] != text[text.length - i - 1]) {
				isIt = false;
				break;
			}

			else {

				isIt = true;
			}
		}
		if (isIt) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}
		

	}

    
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

    public static void MostRepeatedElement(String inputArray[]) {
        HashMap<String, Integer> data = new HashMap<>();
        for (String i : inputArray) {
            if (data.containsKey(i)) {
                data.put(i, data.get(i) + 1);
            } else {
                data.put(i, 1);
            }
        }
        String element = "";
        int freq = 1;
        Set<Entry<String, Integer>> m = data.entrySet();
        for (Entry<String, Integer> entry : m) {
            if (entry.getValue() > freq) {
                element = entry.getKey();
                freq = entry.getValue();
            }
        }
        if (freq > 1) {
            System.out.println("The most frequent element : " + element);
            System.out.println("Its frequency : " + freq);
        } else {
            System.out.println("No frequent element. All elements are unique.");
        }
    }

    public static double GetMedian(int arr[]) {
        Arrays.sort(arr);
        double median;

        if (arr.length % 2 == 0) {
            median = ((double) arr[arr.length / 2] + (double) arr[arr.length / 2 - 1]) / 2;
        } else {
            median = (double) arr[arr.length / 2];
        }

        return median;
    }

    public static ArrayList<Integer> get_minimum(int[] array) {
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> minimum_arr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array2.add(array[i]);
        }
        Collections.sort(array2);
        for (int i = 0; i < array2.size(); i++) {
            if (minimum_arr.isEmpty()) {
                minimum_arr.add(array2.get(i));
            } else if (!minimum_arr.contains(array2.get(i))) {
                minimum_arr.add(array2.get(i));
            }
            if (minimum_arr.size() == 3) {
                break;
            }
        }
        return minimum_arr;
    }

    public static void ShiftArray(String array) {
        List<Integer> num = new ArrayList<>();
        List<String> Char = new ArrayList<>();
        if (array.contains(",")) {
            String h = "";
            int x = 0;
            for (int i = 0; i < array.length(); i++) {
                if (array.charAt(i) == ',') {
                    x = Integer.parseInt(h);
                    num.add(x);
                    h = "";
                } else {
                    h += array.charAt(i);
                }
                if (i == array.length() - 1) {
                    x = Integer.parseInt(h);
                    num.add(x);
                    h = "";
                }
            }
            int Arr[] = new int[num.size()];
            for (int i = 0; i < Arr.length; i++) {
                Arr[i] = num.get(i);
            }

            int temp = Arr[0];
            for (int i = 1; i < Arr.length; i++) {
                Arr[i - 1] = Arr[i];
            }
            Arr[Arr.length - 1] = temp;
            for (int i = 0; i < Arr.length; i++) {
                if (i == Arr.length - 1) {
                    System.out.print(Arr[i]);
                } else {
                    System.out.print(Arr[i] + ",");
                }
            }
        } else {
            String h = "";
            for (int i = 0; i < array.length(); i++) {
                h += array.charAt(i);
                Char.add(h);
                h = "";
            }
            String Arr[] = new String[Char.size()];
            for (int i = 0; i < Arr.length; i++) {
                Arr[i] = Char.get(i);
            }

            String temp = Arr[0];
            for (int i = 1; i < Arr.length; i++) {
                Arr[i - 1] = Arr[i];
            }
            Arr[Arr.length - 1] = temp;
            for (int i = 0; i < Arr.length; i++) {
                System.out.print(Arr[i]);
            }
          }
        }
	
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
	
	static void shuffluarray(int[] ar)
    {

        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i >= 0; i--)
        {
            int index = rnd.nextInt(i + 1);

            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
            System.out.println(ar[i]);
        }
    }
	

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        int size;
        
	    while(true){
	    	System.out.println("To get the maximun number from an array, enter 1\n" +
		    		"To check weather a string is palindrom or not, enter 2\n" +
		    		"To get the average value from an array, enter 3\n" +
		    		"To know the most repeated element from an array of elements, enter 4\n" +
		    		"To get the median from an array, enter 5\n" +
		    		"To know the minimum value among an array of numbers, enter 6\n" +
		    		"To shift an array, enter 7\n" +
		    		"To get the least prime number in an array of numbers, enter 8\n" +
		    		"To Shuffle an array, enter 9\n" +
		    		"Or to exit, enter 0");
		    
		    choice = input.nextInt();
	    
		    switch(choice){
		    case 1:
		    	System.out.println("How many numbers you wish to add? ");
		    	size = input.nextInt();
		    	int[] arr = new int[size];
		    	System.out.println("Fill in the numbers: ");
		    	
		    	for(int i = 0; i < size; i++){
		    		arr[i] = input.nextInt();
		    		 
		    	}
		    	get_max_numbers(arr, size);
		    	break;
		    	
		    case 2:
		    	isPalindrom();
		    	break;
		    	
		    case 3:
		    	System.out.println("How many numbers you wish to add? ");
		    	size = input.nextInt();
		    	double[] avArr = new double[size];
		    	System.out.println("Fill in the numbers: ");
		    	
		    	for(int i = 0; i < size; i++){
		    		avArr[i] = input.nextInt();
		    		 
		    	}
		    	getAvg(avArr);
		    	break;
		    	
		    case 4:
		    	System.out.println("How many elements you wish to add? ");
		    	size = input.nextInt();
		    	String[] stringArr = new String[size];
		    	System.out.println("Fill in the Strings: ");
		    	
		    	for(int i = 0; i < size; i++){
		    		stringArr[i] = input.nextLine();
		    	}
		    	MostRepeatedElement(stringArr);
		    	break;
		    case 5:
		    	System.out.println("How many numbers you wish to add? ");
		    	size = input.nextInt();
		    	int[] medArray = new int[size];
		    	System.out.println("Fill in the numbers: ");
		    	
		    	for(int i = 0; i < size; i++){
		    		medArray[i] = input.nextInt();
		    		 
		    	}
		    	System.out.println("the median is: " + GetMedian(medArray));
		    	break;
		    	
		    case 6:
		    	System.out.println("How many numbers you wish to add? ");
		    	size = input.nextInt();
		    	int[] Array = new int[size];
		    	System.out.println("Fill in the numbers: ");
		    	
		    	for(int i = 0; i < size; i++){
		    		Array[i] = input.nextInt();
		    		 
		    	}
		    	System.out.println("the minimum is: " + get_minimum(Array));
		    	break;
		    	
		    case 7:
		    	System.out.println("Enter a String to shift: ");
		    	String theString;
		    	theString = input.nextLine();
		    	ShiftArray(theString);
		    	break;
		    	
		    case 8:
		    	System.out.println("How many numbers you wish to add? ");
		    	size = input.nextInt();
		    	int[] array = new int[size];
		    	System.out.println("Fill in the numbers: ");
		    	
		    	for(int i = 0; i < size; i++){
		    		array[i] = input.nextInt();
		    	}
		    	System.out.println(getSmallestPrime(array));
		    	break;
		    	
		    case 9:
		    	System.out.println("How many numbers you wish to add? ");
		    	size = input.nextInt();
		    	int[] ar = new int[size];
		    	System.out.println("Fill in the numbers: ");
		    	
		    	for(int i = 0; i < size; i++){
		    		ar[i] = input.nextInt();
		    	}
		    	shuffluarray(ar);
		    	break;
		    case 0:
		    	return;
		    default:
		    	System.out.println("Invalid Input!");
		    }
	    }
	   }

}
