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
public class WordLadder {
        public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<String, String> path = new HashMap<String, String>();
        HashSet<String> hs = new HashSet<String>();
        Queue<String> q = new LinkedList<String>();
        hs.add(start);
        q.offer(start);
        
        while(q.size()!=0){
            String prev = q.poll();
            for(String current:adjacent(prev,dict)){
                if(current.equals(end)){
                    int count =1;                    
                    while(prev!=null){
                        prev = path.get(prev);
                        count++;
                    }
                    return count;
                }
                
                if(!hs.contains(current)){
                    hs.add(current);
                    q.offer(current);
                    path.put(current, prev);
                }
            }
            
            
        }
        return 0;
    }
    
    
    public HashSet<String> adjacent (String str, HashSet<String> dict){
        HashSet<String> result = new HashSet<String>();
        
        for(int i=0; i<str.length(); i++){
            for(char j='a'; j<='z'; j++){
                char[] A = str.toCharArray();
                if(A[i] != j){
                    A[i] =j;
                    String temp = new String(A);
                    if(dict.contains(temp)){
                        result.add(temp);
                    }
                }                
            }   
        }    
        return result;
    }
    
}
