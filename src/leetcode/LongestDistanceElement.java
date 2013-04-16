/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
Longest Distance of elements in an array 
Example: 2 3 2 5 4 3 5

the distance of two 2s is 2
two 3s is 4
two 5s is 3; 

so the answer is 4;

 */
import java.util.*;

public class LongestDistanceElement {
    
    public static int longest(int[] ar){
        
    Hashtable <Integer, int[]> set = new Hashtable<>();
    int distance=Integer.MIN_VALUE;
    for(int i =0; i<ar.length; i++){
        if(set.containsKey(ar[i])){
            int[] index = set.get(ar[i]);
            index[1] = i;
        }
        else{
            int[] index=new int[2];
            index[0]=i;
            index[1]=Integer.MIN_VALUE;
            set.put(ar[i], index);
        }
    }
    for(int key: set.keySet()){
        int[]index = set.get(key);
        if(index[1]>index[0]){
            int temp = index[1] - index[0];
            distance = Math.max(distance, temp);
        }   
    }
    return distance;
        
    }
    
    public static void main(String[] args){
        int a[] = {2, 3, 2, 5, 4, 3, 5};
        System.out.println(longest(a));
        
    }
}
