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
public class Subset {
        public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
            ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>>();

            if(S.length== 0) return alist;
            Arrays.sort(S);
            ArrayList<Integer> ilist = new ArrayList<Integer>();
            alist.add(ilist);
            for(int i=0; i<S.length; i++){
                getsubsets(S[i], alist);
            }

            return alist;		    
    }

	public static void getsubsets(int value, ArrayList<ArrayList<Integer>> alist){
        
            int i =0;
            int size = alist.size();
            ArrayList<Integer> newList;
            while(i< size){
                newList = new ArrayList<Integer>();
                newList.addAll(alist.get(i));

                newList.add(value);
                alist.add(newList);
                print(newList);
                i++;
            }
	}
        
        
        public ArrayList<ArrayList<Integer>> subsets2(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> mList = new ArrayList<ArrayList<Integer>>();
        mList.add(new ArrayList<Integer>());
        
        Arrays.sort(S);
        for(int i=0; i<S.length; i++){
            int size = mList.size();
            for(int j=0; j<size; j++){
                ArrayList<Integer> temp = new ArrayList<Integer>(mList.remove(0));
                ArrayList<Integer> temp2 = new ArrayList<Integer>(temp);
                temp.add(S[i]);
                mList.add(temp2);
                mList.add(temp);
            }
            
        }
        return mList;
        
    }
        
        public static void print(ArrayList<Integer> list){
            for(int i: list){
                System.out.print(i + " ");
            }          
            System.out.println();
        }
        
        public static void main(String []args){
            
            int[] num = {1,2,3};
            subsets(num);
                 
                        
        }
        
    
}
