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
public class MinimumTriangle {
    
     public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        
        while(triangle.size() >1){
            int n = triangle.size();
            ArrayList<Integer> list = triangle.remove(n-1);
            ArrayList<Integer> prevList = triangle.get(n-2);
            
            for(int i =0; i< list.size() -1; i++){
                
                int min = Math.min(list.get(i), list.get(i+1));
                int val = prevList.get(i);
                prevList.set(i, val+min);
            }
            
            
        }
        
        return triangle.get(0).get(0);
        
    }
    
}
