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
public class ThreeSum {
    
        public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(num.length <3){
            return null;
        }
        
        Arrays.sort(num);
        int negative=0;
        for(int i=0; i<num.length; i++){
            
            if(num[i] >= 0){
                negative = i-1;     
                break;
            }

        }
        
        int []positivearray = new int[num.length-negative-1];
        int []negativearray = new int[negative+1];
        System.out.println("Positive array=" + positivearray.length + " negative="+ negative);
        int z =0;
        for(int i=0; i<num.length; i++ ){
            
            if(i>=negative+1){
                positivearray[z]=num[i]; 
                //System.out.println(num[i]);
                z++;
            }
            else{
                negativearray[i] = num[i];
                
            }
        }
        
        
        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int positive = negative +1;
        int negativeValue=0;
        int bst=0;
        for(int j=0; j<negativearray.length-1; j++){
            for(int k=j+1; k<negativearray.length; k++){
                negativeValue = negativearray[j] + negativearray[k];
                bst = binarySearch(positivearray, negativeValue*-1);
                if(bst>=0){
                    list = new ArrayList<Integer>();
                    list.add(num[j]);
                    list.add(num[k]);
                    list.add(positivearray[bst]);
                    aList.add(list);
                    System.out.println(num[j] + " " + num[k] + " " + positivearray[bst] );
                    
                }
            
            }
            
            
        }
        int positiveValue;
        //poistive array
        for(int i=0; i< positivearray.length-1;i++){
            for(int j=i+1; j< positivearray.length;j++){
                positiveValue = positivearray[i] + positivearray[j];
                bst = binarySearch(negativearray, positiveValue*-1);
                if(bst>=0){
                    list = new ArrayList<Integer>();
                    list.add(positivearray[i]);
                    list.add(positivearray[j]);
                    list.add(negativearray[bst]);
                    aList.add(list);
                    System.out.println(positivearray[i] + " " + positivearray[j] + " " + negativearray[bst] );
                    
                }
                
                
            }
        }
        
        
        return aList;
        
    }
    
    
     public static int binarySearch(int[] search, int find) {
                int start, end, midPt;
                start = 0;
                end = search.length - 1;
                while (start <= end) {
                        midPt = (start + end) / 2;
                        if (search[midPt] == find) {
                                return midPt;
                        } else if (search[midPt] < find) {
                                start = midPt + 1;
                        } else {
                                end = midPt - 1;
                        }
                }
                return -1;
        }
     
     
       public static ArrayList<ArrayList<Integer>> threeSum2(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(num.length <3) return null;
        
        ArrayList<ArrayList<Integer>> mList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list;
        Arrays.sort(num);
        for(int i=0; i<= num.length-3; i++){
            int a =num[i];
            int k= i+1;
            int l =num.length-1;
            while(k <l){
                int b = num[k];
                int c= num[l];
                int sum = a+b+c;
                if(sum ==0){
                    list = new ArrayList<Integer>();
                    list.add(a); list.add(b); list.add(c);
                    System.out.println(a + " " + b + " " + c);
                    if(!mList.contains(list)) mList.add(list);
                    l--; k++;
                }
                else if(sum > 0){
                    l--;
                }
                else{
                    k++;
                }
            
            }
                        
        }

        return mList;
        
    }
     
     public static void main(String[] args) {
        int[] array = {-1,0,1};
        threeSum(array);
        threeSum2(array);
        
    }
    
    
    
}
