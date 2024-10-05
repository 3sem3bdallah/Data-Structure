/*
 *
 * ArrayList:
 * A resizable array implementation of the List interface.
 * Provides fast random access but slower removal operations, especially from the beginning or middle, due to shifting elements.
 * 
 * LinkedList:
 * A doubly linked list implementation of the List interface.
 * Provides faster insertion and removal operations but slower access time due to traversal from the head or tail.
 * 
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_VS_LinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Populate both lists
        for (int i = 0; i < 1000000; i++) { // Change to < to avoid adding the 1000000th element
            linkedList.add(i);
            arrayList.add(i);
        }

        // Measure time for LinkedList operations
        long startTime = System.nanoTime();
        linkedList.get(999999); // Access the last element
        linkedList.remove(999999); // Remove the last element
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        // Measure time for ArrayList operations
        startTime = System.nanoTime();
        arrayList.get(999999); // Access the last element
        arrayList.remove(999999); // Remove the last element
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}
