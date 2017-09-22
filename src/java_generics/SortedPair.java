/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;

/**
 *
 * @author Azeez.Taiwo
 * @param <T>
 */
public class SortedPair<T extends Comparable<T>> {
    
    private final T first;
    private final T second;

    public SortedPair(T left , T right){
       
        if(left.compareTo(right) < 1){
            first = left;
            second = right;
        }else{
            first = right;
            second = left;
        }
    }
    
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
