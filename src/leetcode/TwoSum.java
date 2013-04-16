/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcode;
import java.util.*;
/**
 *
 * @author Andrew
 */
public class TwoSum {
    
        public static int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
       
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
        
        for(int i =0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
            hm.put(numbers[i], i);           
        }
        Arrays.sort(numbers);
        System.out.println(hm.size());
        
  
        
        for(int i=0; i< numbers.length-1; i++){
            int value = binarySearch(numbers, target - numbers[i], i+1, numbers.length-1);
            if(value >-1){
                int min = Math.min(hm.get(numbers[i]), hm.get(numbers[value]));
                int max = Math.max(hm.get(numbers[i]), hm.get(numbers[value]));
                return new int[] {min, max};
            }
            
        }
        
        return new int[] {-1,-1};
    }
    
    
    public static int binarySearch(int[] numbers, int target, int start, int end){
        
        if(start > end){return -1;}        
        
        int middle = (start + end)/2;
        
        if(numbers[middle] == target){return middle;}
        else if(numbers[middle] < target){
            return binarySearch(numbers, target, middle+1, end); 
        }
        else if(numbers[middle] > target){
            return binarySearch(numbers, target, start, middle-1);
        }
        return -1;
    }
    
   public static int[] twoSum2(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] A =  new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0; i< numbers.length;i++){
            
            int diff = target-numbers[i];
            System.out.println(diff);
            if(hm.containsKey(diff)){
                A[0] = hm.get(diff);
                A[1] = i;
                break;
            }
            hm.put(numbers[i], i);
        }
        return A;                
    }
    
    public static void main(String [] args){
        
        int A[] = {722,600,905,54,47};
        int [] value = twoSum(A,101);
        int [] B = {25,75,5};
        value = twoSum2(B,100);
        System.out.println(value[0] + " " + value[1]);
        
    }
    
}
