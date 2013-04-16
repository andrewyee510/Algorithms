/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class POW {
     public static double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        boolean negative = n < 0;
        double result = 1.0;
        n = Math.abs(n);
        
        while(n>=1){
            
            if((n%2)==1){
                result *= x;
            }
            x*=x;
            n=n/2;
        }
        return negative?1/result: result;
    }
     
     
     public static void main(String[] args){
         double x = 2.0;
         int n = 10;
         System.out.println(pow(2.0, 10));
         
         
     }
}
