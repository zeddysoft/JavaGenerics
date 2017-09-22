/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;

/**
 *
 * @author Azeez.Taiwo
 */
public class TypeSafeExample {
    public static void main(String[] args) {
        CircularBuffer<String> buffer = new CircularBuffer<>(10);
        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");
//        buffer.offer(1);
        
        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(CircularBuffer<String> buffer) {
        StringBuilder result = new StringBuilder();
        String value;
        
        while((value = (String) buffer.poll()) != null){
            result.append(value);
        }
        
        return result.toString();
    }
}
