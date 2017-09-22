/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Azeez.Taiwo
 */
public class TheArrayProblem {
    public static void main(String[] args) {
        Person don = new Person("Don Eldee", 133);
        Person berd = new Person("Berd Oston", 90);
        Person shegz = new Person("Shegy Don", 74);
        List<Person> persons = new ArrayList<>();
        persons.add(don);
        persons.add(berd);
        persons.add(shegz);
        
        Collections.sort(persons, new ReverseComparator<>(new PersonComparator()));
        System.out.println(persons);
    }

    private static Person[] add(Person cooper, Person[] madMen) {
        final int length = madMen.length;
        madMen = Arrays.copyOf(madMen, madMen.length + 1);
        madMen[length] = cooper;
        return madMen;
    }
}
