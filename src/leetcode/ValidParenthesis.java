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
public class ValidParenthesis {
    
    public static boolean valid(String paren){
        
        Stack<Character> stack = new Stack<Character>();
        while(paren.length() != 0){
            if(paren.charAt(0)=='(')
                stack.push(paren.charAt(0));
            else if(paren.charAt(0)==')'){
                if(stack.size() ==0)
                    return false;
                stack.pop();
            }
            paren = paren.substring(1);
        }
        
        boolean correct = (stack.size()==0)? true: false;
        return correct;
    }
    public static void main(String[] args){
        
        String str = new String("()())(())");
        System.out.println(valid(str));
        
    }
}
