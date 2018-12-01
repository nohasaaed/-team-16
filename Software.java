package software;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;


public class Software {

 
    
    public static ArrayList<Integer> get_minimum(int[] array)
    {
        ArrayList<Integer> array2=new ArrayList<>();
    	ArrayList<Integer> minimum_arr=new ArrayList<>();
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
  
  

		public static void ShiftArray(String array)
		{
			List<Integer> num = new ArrayList<>();
			List<String> Char = new ArrayList<>();
			if (array.contains(","))
			{
				String h="";
				int x=0;
				for(int i=0 ; i<array.length() ; i++)
				{
					if (array.charAt(i)==',')
					{
						x=Integer.parseInt(h);
						num.add(x);
						h="";
					}
					else {
						h+=array.charAt(i);
					}
					if (i==array.length()-1)
					{
						x=Integer.parseInt(h);
						num.add(x);
						h="";
					}
				}
				int Arr[] = new int[num.size()];
				for (int i=0 ; i<Arr.length ; i++)
				{
					Arr[i] = num.get(i);
				}
				
				int temp = Arr[0];
				for(int i=1 ; i<Arr.length ; i++)
				{
					Arr[i-1] = Arr[i];
				}
				Arr[Arr.length-1] = temp;
				for (int i=0 ; i<Arr.length; i++)
				{
					if (i==Arr.length-1)
					{
						System.out.print(Arr[i]);
					}
					else
						System.out.print(Arr[i]+",");
				}
			}
			else
			{
				String h="";
				for (int i=0 ; i<array.length() ; i++)
				{
					h+=array.charAt(i);
					Char.add(h);
					h="";
				}
				String Arr[] = new String[Char.size()];
				for (int i=0 ; i<Arr.length ; i++)
				{
					Arr[i] = Char.get(i);
				}
				
				String temp = Arr[0];
				for(int i=1 ; i<Arr.length ; i++)
				{
					Arr[i-1] = Arr[i];
				}
				Arr[Arr.length-1] = temp;
				for (int i=0 ; i<Arr.length; i++)
				{
						System.out.print(Arr[i]);
				}
			}
		}  
	
    public static void main(String[] args) {
        // TODO code application  logic here
      
    }
    
}
