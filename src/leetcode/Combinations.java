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
public class Combinations {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> mList = new ArrayList<ArrayList<Integer>>();
        
        combine(mList, new ArrayList<Integer>(), n, k, 0);
        return mList;
    }
    
    public void combine(ArrayList<ArrayList<Integer>> mList, ArrayList<Integer> list, int n, int k, int index){
        if(list.size()==k){
            mList.add(list);
            return;            
        }else{
            for(int i=index; i<n; i++){
                ArrayList<Integer> list2 = new ArrayList<Integer>(list);
                list2.add(i+1);
                combine(mList, list2, n, k, i+1); 
            }               
        }    
    }
    
}
