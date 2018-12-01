package software;

import java.util.Arrays;
import java.util.*;
import java.util.Map.Entry;

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
            System.out.println("Three largest numbers are "
                    + first + " " + second + " " + third);
        }
    }

    public static double getAvg(double[] arr) {

        double tut = 0;

        for (int i = 0; i < arr.length; i++) {
            tut += arr[i];
        }

        double avg = tut / arr.length;

        return avg;

    }

    static void MostRepeatedElement(String inputArray[]) {
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

    public static void main(String[] args) {
        // TODO code application  logic here

    }

}
