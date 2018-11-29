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
    static void get_max_numbers(int arr[], int len) {
        int first = 0, second = 0, third = 0;
        if(len<3){
        System.out.println("Not valid input");    
        }else{
        
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

    public static void main(String[] args) {
        // TODO code application logic here

    }
    

}
