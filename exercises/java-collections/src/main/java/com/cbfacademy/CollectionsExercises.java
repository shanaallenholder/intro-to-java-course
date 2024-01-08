package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public List<Integer> useLinkedList() {

        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList <>();
        //System.out.println(integers.size()); //0

        //  - add 4 as the first element of the list
        integers.addFirst(4);

        //  - then add 5, 6, 8, 2, 9 to the list
        integers.addAll(List.of(5, 6, 8, 2, 9));
       

        //  - add another 2 as the last element of the list
        integers.addLast(2);
        

        //  - add 4 as the 3rd element of the list
        integers.add(2,4);

        //  - invoke the method element() on the list and print the result on the screen
        Integer head = integers.element();
        System.out.print("Head of the queue" + head);

        //  - return the list
        return integers;

        
    }

       public Stack<Integer> useStack() {

        // TODO: create an empty stack
        Stack <Integer> stack = new Stack<>();
       //System.out.println(stack.size()); //0

        //  - add 5, 6, 8, 9 to the stack
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);
        System.out.println(stack);

        //  - print the first element of the stack on the screen
          System.out.print(stack.peek());

        //  - print the last element of the stack on the screen
          System.out.print(stack.lastElement());

        //  - invoke the method pop() on the stack and print the result on the screen
          System.out.print("Popped Element" + stack.pop());  
          
        //  - invoke the push(4) method on the stack
          stack.push(4);

        //  - return the stack
        return stack;
    }


    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque <Integer> arrayDeque = new ArrayDeque<>();

        //  - add 5, 6, 8, 9 to the queue
            arrayDeque.add(5);
            arrayDeque.add(6);
            arrayDeque.add(8);
            arrayDeque.add(9);
            System.out.println(arrayDeque);



        //  - print the first element of the queue on the screen
            System.out.print(arrayDeque.getFirst());
           
        //  - print the last elem9nt of the queue on the screen
            System.out.print(arrayDeque.getLast());


        //  - invoke the method poll() on the queue and print the result on the screen
            System.out.print(arrayDeque.poll());

        //  - invoke the element() method on the queue and print the result on the screen
            System.out.print(arrayDeque.element());

        //  - return the queue
           return arrayDeque;
    }




    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
         HashMap <Integer, String> hashMap = new HashMap<>();

        //  - add {1, TypeScript} entry to the map
           hashMap.put(1, "TypeScript");

        //  - add {2, Kotlin} entry to the map
           hashMap.put(2, "Kotlin");

        //  - add {3, Python} entry to the map
           hashMap.put(3, "Python");

        //  - add {4, Java} entry to the map
           hashMap.put(4, "Java");

        //  - add {5, JavaScript} entry to the map
           hashMap.put(5, "JavaScript");

        //  - add {6, Rust} entry to the map
           hashMap.put(6, "Rust");
          


        //  - determine the set of keys from the map and print it on the screen
             Set<Integer> keys = hashMap.keySet();
               for (Integer k : keys) 
            System.out.println("key: " + k);


        //  - determine the set of values from the map and print it on the screen
            Collection<String> values = hashMap.values();
               for (String v : values) 
            System.out.println("value: " + v);


        //  - determine whether the map contains "English" as a language and print the result on the screen
           System.out.println(hashMap.containsValue("English")); //false

        //  - return the map
            return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
