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
public class LetterCombinationOfPhoneNumber {
    Hashtable <Integer, String[]> Dict = new Hashtable <Integer, String[]>();  
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> res = new ArrayList<String>();
        if(digits.length()==0){
            res.add("");
            return res;
        }
        Dict.put(2, new String[]{"a", "b", "c"});
        Dict.put(3, new String[]{"d", "e", "f"});
        Dict.put(4, new String[]{"g", "h", "i"});
        Dict.put(5, new String[]{"j", "k", "l"});
        Dict.put(6, new String[]{"m", "n", "o"});
        Dict.put(7, new String[]{"p", "q", "r", "s"});
        Dict.put(8, new String[]{"t", "u", "v"});
        Dict.put(9, new String[]{"w", "x", "y", "z"});
         
        interleave(res, digits,"");
        return res;
    }
    public void interleave(ArrayList<String> res, String digits, String buffer){
        if(digits.length()==0) {
            res.add(buffer);
            return;
        }
        for(String c: Dict.get(digits.charAt(0)-'0'))
                interleave(res, digits.substring(1),buffer+c);
 
    }
    
}
