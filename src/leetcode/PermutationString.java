/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class PermutationString {
    
    public static void permute(String s){
        if(s.length()==0) return;
        permute(s, "");
    }
     public static void permute(String s, String res){
         if(s.length()==0)
             System.out.print(res+"\n");
         for(int i =0; i<s.length(); i++)
             permute(s.substring(0,i)+s.substring(i+1), res+s.charAt(i));
     }
     public static void main(String[] args){
         
         permute("abc");
         String s = "abc";
         System.out.println(s.substring(0,1)+s.substring(1+1));
         
     }
    
}
