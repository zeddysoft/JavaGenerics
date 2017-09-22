/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Azeez.Taiwo
 */
public class SortingExamples {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        final Person youngestCastMember = min(madMen, new PersonComparator());
        
        System.out.println(youngestCastMember);
        System.out.println(min(a, Integer::compare));
    }

    public static <T> T min(List<T> list, Comparator<T> comparator) {
        T lowest = list.get(0);

        for (int i = 1; i < list.size(); ++i) {
            final T element = list.get(i);
            if (comparator.compare(element, lowest) < 0) {
                lowest = element;
            }
        }

        return lowest;
    }
}
