/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class PalindromeInteger {
    
   public static boolean reverse(int data){
        int length = String.valueOf(data).length();
        int remainder =0;
        int value =0;
        for(int i =0; i< length; i++){
            remainder = data % 10;
            data = data/10;
            value = value + remainder*(int)Math.pow(10, length-i-1);

        }
        System.out.println(value + " " + data);
        return value == data;
    }
    
    public static void main(String []args){
        int number = 323;
        System.out.println(reverse(number));
        int value = 2 + ('3'-'0');
        System.out.println(value);
        
    }
    
}
