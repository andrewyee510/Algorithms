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
public class GenerateParenthesis {
    public static ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();
        char[] str = new char[n*2];
        paren(list, str, n,n, 0);
        return list;          
    }
    
    public static void paren(ArrayList<String> list,char[] str, int leftRem, int rightRem, int count){
        
        if(leftRem <0 || rightRem <0){
            return;
        }
        
        
        if(leftRem ==0 && rightRem ==0){
            String s = String.copyValueOf(str);
            list.add(s);        
        }
        else{
            
            if(leftRem > 0){
                str[count] = '(';
                paren(list,str, leftRem-1,rightRem, count+1);
            }
            
            if(rightRem > leftRem){
                str[count] = ')';            
                paren(list,str, leftRem,rightRem-1, count+1);
            }
        }
    }
    
    public static void main(String[] args){
        
        ArrayList<String> list = generateParenthesis(3);
        for(String s: list){
            System.out.println(s);
        }
        
        
    }
}
