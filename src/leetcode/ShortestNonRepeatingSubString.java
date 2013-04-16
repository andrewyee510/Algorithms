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
public class ShortestNonRepeatingSubString {
        public static String shortestNonRepeatSubstring(String s){
        Hashtable<String, Integer> set;
       
        for(int i=1;i<s.length();i++){
            set = new Hashtable<String, Integer>();
            for(int j=0;j<=s.length()-i;j++){
                String str = s.substring(j,j+i);
                int count = 1;
                if(set.containsKey(str)){
                    count = set.get(str)+1;
                }
                set.put(str, count);
            }
            for(String sub: set.keySet()){
                if(set.get(sub)==1)
                    return sub;
            }
        }
        return "";
    }
        
    public static void main (String[] args){
        
        System.out.println(shortestNonRepeatSubstring("aabbabbaab"));
        
        
    }
}
