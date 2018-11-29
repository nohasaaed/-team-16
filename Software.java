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
    
    public static ArrayList<Integer> get_minimum(int[] array)
    {
        ArrayList<Integer> array2=new ArrayList<Integer>();
    	ArrayList<Integer> minimum_arr=new ArrayList<Integer>();
    	for(int i=0;i<array.length;i++)
    		array2.add(array[i]);
    	Collections.sort(array2);
        for(int i=0;i<array2.size();i++)
        {
        	if(minimum_arr.isEmpty())
        		minimum_arr.add(array2.get(i));
        	else if(!minimum_arr.contains(array2.get(i)))
        		  minimum_arr.add(array2.get(i));
        	if(minimum_arr.size()==3)
        		   break;
        }
        return minimum_arr;
    }

    public static void main(String[] args) {
        // TODO code application  logic here
      
    }
    
}
