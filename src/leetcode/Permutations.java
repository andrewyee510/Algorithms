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
public class Permutations {
    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>>();
        if(num.length== 0) return alist;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(num[0]);
        alist.add(list);
        
        for(int i=1; i<num.length; i++){
            int size = alist.size();
            for(int j=0; j< size; j++){
                list = alist.remove(0);
                for(int k=0; k<=list.size(); k++){
                    ArrayList<Integer> newlist = new ArrayList<Integer>();                    
                    newlist.addAll(list);
                    newlist.add(k, num[i]);
                    alist.add(newlist);
                }    
            }    
                           
        }
        return alist;
    }
        
    
    
    
    
    public static void printArrayList(ArrayList<ArrayList<Integer>> list){
        
        for(ArrayList<Integer> a: list){
            for(Integer i: a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        
    }
    
    
    
    public static ArrayList<String> permuteString(String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(word==null){
            return null;
        }
        ArrayList<String> permutations = new ArrayList<String>();
        if(word.length() == 0){
            return permutations;
        }
        
        String first = word.substring(0,1);
        permutations.add(first);
        String remainder = word.substring(1);

        for(int i =1; i<word.length(); i++){
            int size = permutations.size();
            for(int j=0; j<size; j++){
               String list = permutations.remove(0);
               for(int k=0; k<=list.length(); k++){
                    String a = list.substring(0,k);
                    String b = list.substring(k);
                    
                    String c = a+word.charAt(i)+b;
                    
                    permutations.add(c);
               }
            }
        } 
        return permutations;
        
    }
    
    public static void printString( ArrayList<String> list){
        
        for(String s: list){
            System.out.println(s);
        }

    }
    
    public void permute(ArrayList<ArrayList<Object>> mList, ArrayList<Object> list, boolean[] used, int[] num){
        
        if(list.size() == used.length){
            ArrayList<Object> temp = new ArrayList<Object>(list);
            mList.add(temp);
        }else{
            for(int i=0; i<num.length; i++){
                if(!used[i]){
                    used[i]= true;
                    list.add(num[i]);
                    permute(mList, list, used, num);
                    list.remove(list.size()-1);
                    used[i]=false;
                }
            }        
        }        
    }
    
    
     public static void main(String[] args){
         
         
         int [] array ={1,2,3};
         ArrayList<ArrayList<Integer>> list = permute(array);
         printArrayList(list);
         
         String abc = "abc";
         ArrayList<String> string = permuteString(abc);
         printString(string);
         
         //System.out.print(abc.substring(4));
         
     }
    
    

}
