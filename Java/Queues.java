import java.util.LinkedList;
import java.util.Queue;
public class Queues {

    public static void main(String[] args) {
    
    /*
        Queue => is a FIFO data structure. First in First out, like line of people
        A collection designed for holding element prior to processing 
        Linear data structure.

        add = enqueue, offer()
        remove = dequeue, poll()

        Where it use?
                    1. Keyboard Buffer
                    2. printer Queue
                    3. Used in {LinkedList, priorityQueue, Bread First Search (BFS)}

    */ 
        
        Queue<String> queue= new LinkedList<String>();

        // Adding element.
        queue.add("Aly");
        queue.add("Ahmed");
        queue.add("Sara");
        queue.add("Heba");

        System.out.println(queue.isEmpty()); // Check if queue is empty or not.

        System.out.println(queue.size()); // Return the number of elements in this collection.

        System.out.println(queue.peek()); // Return head of this queue, or null if this queue is empty.

        queue.poll(); // Remove the tail of this queue.

        System.out.println(queue); 



    }
}