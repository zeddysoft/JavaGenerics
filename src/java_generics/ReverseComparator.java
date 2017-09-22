/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;

import java.util.Comparator;

/**
 *
 * @author Azeez.Taiwo
 */
public class ReverseComparator<T> implements Comparator<T>{
    
    private final Comparator<T> delegate;
    
    public ReverseComparator(Comparator<T> delegate){
        this.delegate = delegate;
    }

    @Override
    public int compare(T o1, T o2) {
        return -1 * delegate.compare(o1, o2);
    }
    
}
