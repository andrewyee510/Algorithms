/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class CompressRepeatedLetters {
    
    
    public static String compress(String str){
        
        if(str.length()<=0) return str;
        StringBuilder buffer = new StringBuilder(); 
        int i=0;
        int j=str.length()-1;
        int count =0;
        char current;
        while(i<=j){
            current = str.charAt(i);
            buffer.append(current);
            i++;
            count=1;
            while(i<=j && str.charAt(i) == current){
                count++;
                i++;
            }
            if(count >1){
               buffer.append(count);
            }
        }
        
        return buffer.toString();
    }
    
    public static void main (String[] args){
        String str = "aaaabbccc";
        str = "aacacbcc";
        System.out.println(compress(str));
        
    }
    
}
