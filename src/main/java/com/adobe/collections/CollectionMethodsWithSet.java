package com.adobe.collections;

import java.util.*;

public class CollectionMethodsWithSet {
    public static void main(String[] args) {
        // Create a Set using HashSet
        Set<String> fruits = new HashSet<>();

        // add(E e)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // size()
        System.out.println("Size: " + fruits.size()); // 3

        // isEmpty()
        System.out.println("Is empty? " + fruits.isEmpty()); // false

        // contains(Object o)
        System.out.println("Contains Banana? " + fruits.contains("Banana")); // true

        // iterator()
        System.out.print("Iterating: ");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // toArray()
        Object[] fruitArray = fruits.toArray();
        System.out.println("toArray: " + Arrays.toString(fruitArray));

        // toArray(T[] a)
        String[] typedArray = fruits.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // addAll(Collection<? extends E> c)
        Set<String> moreFruits = new HashSet<>();
        moreFruits.add("Date");
        moreFruits.add("Elderberry");
        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits);

        // containsAll(Collection<?> c)
        System.out.println("Contains all moreFruits? " + fruits.containsAll(moreFruits)); // true

        // remove(Object o)
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // removeAll(Collection<?> c)
        fruits.removeAll(moreFruits);
        System.out.println("After removeAll(moreFruits): " + fruits);

        // retainAll(Collection<?> c)
        fruits.add("Fig");
        fruits.add("Grape");
        Set<String> filterSet = new HashSet<>();
        filterSet.add("Apple");
        filterSet.add("Fig");
        fruits.retainAll(filterSet);
        System.out.println("After retainAll(filterSet): " + fruits);

        // equals(Object o)
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Apple");
        anotherSet.add("Fig");
        System.out.println("Equals anotherSet? " + fruits.equals(anotherSet)); // true

        // hashCode()
        System.out.println("HashCode: " + fruits.hashCode());

        // clear()
        fruits.clear();
        System.out.println("After clear(), is empty? " + fruits.isEmpty());
    }
}
