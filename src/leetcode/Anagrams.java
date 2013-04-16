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
public class Anagrams {
        public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();
        if(strs.length ==0){return list;}
        
        HashMap<String, String> hm = new HashMap<String, String>();
        
        
        String[] sortStr = new String [strs.length];
        
        
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            sortStr[i] = new String(chars);
        
        }        
        
        for(int i=0; i<strs.length; i++){
            
            if(hm.containsKey(sortStr[i])){
                String value = hm.get(sortStr[i]);
                if(!list.contains(value)){
                    list.add(value);
                }
                list.add(strs[i]);
            }
            hm.put(sortStr[i], strs[i]);
                        
        }
        return list;
        
        
    }
        
        public ArrayList<String> anagrams2(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs.length==0) return  null;
        String[] A = new String [strs.length];
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        for(int i =0; i<A.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            A[i] = new String(charArray);
            if(hm.containsKey(A[i])){
                int x = hm.get(A[i])+1;
                hm.put(A[i],x);
            }else hm.put(A[i],1);
        }
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<A.length; i++){
            int count = hm.get(A[i]);
            if(count>1){
                list.add(strs[i]);
            }
        }
        return list;
    }
    
}
