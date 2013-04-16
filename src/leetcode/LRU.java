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
public class LRU extends LinkedHashMap {
    private int size;
    public LRU(int size){
        super(size , 1.1f, true);
        this.size = size;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest)
   {
    return size() > this.size;
   }

    public static void main(String[] argvs){
        LRU lru = new LRU(3);
        
        lru.put("one", "one");
        lru.put("two", "two");
        lru.put("three", "three");
        lru.put("four","four");
            
        for(Object o: lru.keySet())
            System.out.print(o.toString() + " ");
        System.out.println();
        lru.put("two", "two");
        lru.put("three", "three");

        for(Object o: lru.keySet())
            System.out.print(o.toString() + " ");
        System.out.println();
        lru.put("five","five");

        for(Object o: lru.keySet())
            System.out.print(o.toString() + " ");
        System.out.println();
    }
}
