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
public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();  
        if(numRows <=0){return mainList;}
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        mainList.add(list);
        
        for(int i=1; i < numRows; i++){
            ArrayList<Integer> prevList = mainList.get(i-1);
            ArrayList<Integer> newList = new ArrayList<Integer>();
            for(int j=0; j < i+1; j++){
                if(j==0 || j ==i){
                    newList.add(1);
                }
                else{
                    int value = prevList.get(j);
                    int prev = prevList.get(j-1);
                    newList.add(value+prev);
                }            
            }            
            mainList.add(newList);        
        }
        return mainList;
    }
    
}
