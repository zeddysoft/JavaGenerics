/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;

import java_generics.SortedPair;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Azeez.Taiwo
 */
public class SortedPairTest {
    
    @Test
    public void shouldRetainOrderOfOrderedPair(){
        SortedPair<Integer> sortedPair = new SortedPair<>(1,2);
        Assert.assertEquals(1, sortedPair.getFirst().intValue());
        Assert.assertEquals(2, sortedPair.getSecond().intValue());
    }
    
    @Test
    public void shouldFlipOrderOfMisorderedPair(){
        SortedPair<Integer> pair = new SortedPair<>(2,1);
        Assert.assertEquals(1, pair.getFirst().intValue());
        Assert.assertEquals(2, pair.getSecond().intValue());
    }
}
