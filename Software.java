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




      static void MostRepeatedElement(String inputArray[])
    {


        HashMap<String, Integer> data = new HashMap<String, Integer>();
        for (String i : inputArray)
        {
            if (data.containsKey(i))
            {


                data.put(i, data.get(i)+1);
            }
            else
            {

                data.put(i, 1);
            }
        }

        String element = "";
        int freq = 1;
        Set<Entry<String, Integer>> m = data.entrySet();

        for (Entry<String, Integer> entry : m)
        {
            if(entry.getValue() > freq)
            {
                element = entry.getKey();

                freq = entry.getValue();

            }

        }

        //Printing the most frequent element in array and its frequency
        if(freq > 1)
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));

            System.out.println("The most frequent element : "+element);

            System.out.println("Its frequency : "+freq);

            System.out.println("========================");
        }

        else
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));

            System.out.println("No frequent element. All elements are unique.");

            System.out.println("=========================");
        }
    }



    public static void main(String[] args) {
        // TODO code application  logic here

    }

}
