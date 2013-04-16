/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Andrew
 */
public class MinimumIndex {
    
    public static int rightMostIndex(int[] array){
        
        for(int i=1; i<array.length; i++){
            if(array[i] < array[i-1]) return (i-1);
            
        }
        return array.length-1;
    }
    
    public static int leftMostIndex(int[] array){
        
        for(int i=array.length-1; i>0; i--){
            //System.out.println("array[i-1]="+array[i-1] + " array[i]=" + array[i]);
            if(array[i] < array[i-1]) return i;
        }
        
        return 0;
    }
    
    
    public static int minMiddle(int[] array, int leftMax, int start){
        
        for(int i=leftMax; i>0; i--){
            if(array[i] < start) return i;
        }
        
        return 0;
    }
    
     public static int maxMiddle(int[] array, int rightMin, int start){
        for(int i=rightMin; i<array.length; i++){
            if(array[i] > start) return i;
        }
        
        return array.length-1;
    }
    
    
    
    public static void main(String[] args){
        int array[] = {1,2,4,7,10,11,7,12,6,7,16,18,19};
        //output (3,9);
        int leftMax = rightMostIndex(array);
        int rightMin = leftMostIndex(array);
        
        System.out.println("Left max=" + leftMax + " Right min=" + rightMin);
        int middleMin = leftMax +1;
        int middleMax = rightMin-1;
        if(middleMin >= array.length-1 || middleMax <= 0){
            //nothing
        }
        else{
            int minIndex = minMiddle(array, leftMax, middleMin);
            int maxIndex = maxMiddle(array, rightMin, middleMax);
            System.out.println("Min Index=" + minIndex + " Max Index=" + maxIndex);
  
        }
        
        
        
    }
    
}
