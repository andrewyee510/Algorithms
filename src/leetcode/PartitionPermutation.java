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
public class PartitionPermutation {
    
        public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<String>> mList = new ArrayList<ArrayList<String>>();
        dfs(mList, new ArrayList<String>(), s);
        return mList;
    }
    
    public void dfs(ArrayList<ArrayList<String>> mList, ArrayList<String> list, String s){
        if(s.length()==0) {
            mList.add(list);
            return;
        }else{
            for(int i=1; i<=s.length(); i++){
                String str = s.substring(0,i);
                if(isPalindrome(str)){
                    ArrayList<String> list2 = new ArrayList<String>(list);
                    list2.add(str);
                    dfs(mList, list2, s.substring(i));
                }
                
            }                
        }
                
    }    
    
    public boolean isPalindrome(String s){
        if(s.length()==0) return false;
        int start=0; int end= s.length()-1;
        while(start<=end){
            if(s.charAt(start)== s.charAt(end)){
                start++; end--;
            }else return false;
            
        }
        return true;
    }
    
}
