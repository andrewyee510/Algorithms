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
public class MinimumWindowAverage {
    int n;
    double sum;
    Queue<Integer> queue ;
    
    MinimumWindowAverage(int num){
        n=num;
        queue = new LinkedList<Integer>(); 
        sum=0;
    }
    
    public void insertValue(int x){
        if(queue.size()==n){
            sum = sum -queue.remove() + x;
            queue.add(x);
        }else{
            queue.add(x);
            sum+=x;
        }
    }
    
    public double average(){
        if(queue.size()==0) return 0;
        double avg = sum/queue.size();
        return avg;
    }
    
    public static void main (String []args){
        MinimumWindowAverage mwa = new MinimumWindowAverage(2);
        mwa.insertValue(1);
        System.out.println(mwa.average());
        mwa.insertValue(2);
        System.out.println(mwa.average());
        mwa.insertValue(3);
        System.out.println(mwa.average());
        mwa.insertValue(4);
        System.out.println(mwa.average());
        
    }
    
    
}
