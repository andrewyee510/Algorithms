/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class sqrt {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x<=0) return 0;
        long left = 0;
        long right = x;
        while(left<=right){
            long mid = left + (right - left)/ 2;
            long temp = mid* mid;
            if(temp == x) 
                return (int)mid;
            else
            if(temp> x)
                right = mid-1;
            else
                left = mid+1;
        }
        return (int)right;
    }
}
