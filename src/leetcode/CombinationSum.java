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
public class CombinationSum {
        public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(candidates);

        combination(candidates, target, mainList, new ArrayList<Integer>());
        return mainList;    
    }
    
    public void combination(int[] candidates, int target,ArrayList<ArrayList<Integer>> mainList, ArrayList<Integer> list){
              
        if(target ==0){
            mainList.add(list);
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = 0; i < candidates.length; ++i) {
            if(candidates[i] <= target){
                ArrayList<Integer> partial_sol = new ArrayList<Integer>();
                partial_sol.addAll(list);
                partial_sol.add(candidates[i]);
                int[] remaining = new int[candidates.length - i ];
                System.arraycopy(candidates, i, remaining, 0, remaining.length);
                combination(remaining, target- candidates[i], mainList, partial_sol);
            }
        }
        return;
    }   
    
}
