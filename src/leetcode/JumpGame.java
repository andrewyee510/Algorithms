/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
 */
public class JumpGame {
    
    
    public static boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        // Start typing your Java solution below
        // DO NOT write main() function
        int flag = A.length-1;
        for(int i=A.length -2; i>=0; i--){
            System.out.println(A[i] + " " + (flag-i));
            if(A[i] >= flag -i)//reachacle from A[i] to flag
                flag = i;
        }
        return flag == 0;

    }
    
    
    public static void main(String[]  args){
        
        int A[] ={1,0,3};
        int B[] = {2,2,0,0,0,0,2,0,1};
        
        System.out.println(canJump(A)); 
        System.out.println(canJump(B));       

        
    }
    
}
