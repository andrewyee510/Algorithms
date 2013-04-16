/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
;
package leetcode;
import java.util.*;
/**
 *
 * @author Andrew
 */
public class MergeIntervals {
      public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
     }
    
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(intervals.size()==0){return intervals;}
        Collections.sort(intervals, INTERVAL_ORDER);
        ArrayList<Interval> result = new ArrayList<Interval>(); 
        
        result.add(intervals.remove(0));
        for(Interval i: intervals){
            Interval temp = result.get(result.size()-1);
            if(temp.end < i.start){
                result.add(i);
            }
            else{
                int max = Math.max(temp.end, i.end);
                temp.end = max;
            }
            
        }
        
        return result;
    }
    static final Comparator<Interval> INTERVAL_ORDER = new Comparator<Interval>(){
        public int compare (Interval i, Interval j) {
            return new Integer(i.start).compareTo(new Integer(j.start));
        }
    };
    
}
