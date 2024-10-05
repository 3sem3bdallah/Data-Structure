import java.util.LinkedList;
public class LinkedLists {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();


    /*
        LinkedList => stores Nodes in 2 parts (data, address)
                      Nodes are in non-consecutive memory locations
                      Element are linked using pointers
                      
                            Singly Linked List
                Node                   Node            Node
            [data | address] -> [data | address]->[data | address]                  
                                Doubly Linked List
                        Node                         Node
            [address | data | address] -> [address | data | address]     

        Advantages: 1. Dynamic Data Structure 
                    2. Insertion and deletion is O(1)
                    3. No/Low memory waste

        Disadvantages: 1.Greater memory usage
                       2. No random access of elements (no index [i])
                       3. Accessing/searching elements is more time consuming
    */


   // act like Stack.
            linkedList.push("A");
            linkedList.push("B");
            linkedList.push("C");
            linkedList.push("D");
            linkedList.push("F");
            linkedList.pop(); // "F" is removed.
            System.out.println(linkedList);
      

   // act like Queue.
            linkedList.offer("A");
            linkedList.offer("B");
            linkedList.offer("C");
            linkedList.offer("D");
            linkedList.offer("F");
            linkedList.poll();  // "A" is removed.
            System.out.println(linkedList);
              
        
            
            linkedList.add(3,"E"); // adding in specific index
            linkedList.remove("B"); // remove specific element
            System.out.println(linkedList);
        

            System.out.println(linkedList.peekFirst()); // Return first element
            System.out.println(linkedList.peekLast()); // Return last element

            linkedList.addFirst("0"); // adding in first index
            linkedList.addLast("1"); // adding in last index


            System.out.println(linkedList.indexOf("C")); // Return index of specified element in this list, or -1 if does not contain in the element
            System.out.println(linkedList);
    }
}