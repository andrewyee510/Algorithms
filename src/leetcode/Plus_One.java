/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class Plus_One {
     public static int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = digits.length;
        int carry = 1;
        int total =0;
        for (int i = len - 1; i >=0; i--){
            total += digits[i] *(int) Math.pow(10, len-i-1); 
            System.out.println(total + " digits=" + digits[i] + " math.pow " + digits[i] *(int) Math.pow(10, len-i-1));
        }
        total +=1;
        
        int[] result =  new int[String.valueOf(total).length()];
        //System.out.println(total + " len=" + result.length);
        for (int i = result.length-1; i >=0; i--){
            result[i] = total%10;
            total = total /10;
        }
        return result;
    }
     
     public static void main(String []args){
        int array [] = {9,8,7,6,5,4,3,2,1,0};
        int newarray[] = plusOne(array);
        for (int i = 0; i < newarray.length; i++){
            System.out.println(newarray[i]);
        }
     }
}
