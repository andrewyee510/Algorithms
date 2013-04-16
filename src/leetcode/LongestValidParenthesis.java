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
public class LongestValidParenthesis {
        public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length() ==0) return 0;        
        int count =0;
        for(int i =0; i< s.length(); i++){
            for(int j= 0; j<i+1 ; j++){
                                
                if(valid(s.substring(j, s.length()-i+j))){
                    return s.length()-i;
                }
                                
            }
        }
        
        return count;
    }
    
    public boolean valid(String s){
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i =0; i <s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            else{
                if(stack.size()==0 ){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.size()==0;
    }
    
}
