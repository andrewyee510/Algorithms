/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class ReverseInt {
    
    
    public static int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean isNeg = x<0;
        x = Math.abs(x);
        int len = String.valueOf(x).length();
        int sum =0;
        for(int i=0; i<len; i++){
            sum += (int)Math.pow(10, len-i-1) * (x%10);
            x = x/10;
        }
        return isNeg? -1*sum: sum;
    }
    
    public static void main(String []args){
        int number = 123;
        System.out.println(reverse(number));
        int value = 2 + ('3'-'0');
        System.out.println(value);
        
    }
    
}
