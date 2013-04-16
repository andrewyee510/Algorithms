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
public class StringUniqueCharacters {
    
    public static boolean unique(String string){
        
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        String substr="";
        int value=0;
        for(int i=0; i<string.length(); i++){
            substr = string.substring(i,i+1);
            if(hm.containsKey(substr)){
               value =hm.get(substr)+1;                               
               hm.put(substr, value);
               return false;
            }
            else{
                hm.put(substr, 1);
            }
   
        }

        return true;
    }
    
    public static void main(String[]args){
        String string = "agbcdefg";
        System.out.println(unique(string));  
    }
    
    
    
}
