
import java.util.ArrayDeque;
public class Arraydeque {
   
    public static void main(String[] args) {
        // Create an ArrayDeque of Integers
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.addFirst(10); // Adds 10 to the front
        deque.addLast(20);  // Adds 20 to the back
        deque.addLast(30);  // Adds 30 to the back

        // Displaying the deque
        System.out.println("Deque: " + deque);

        // Accessing elements without removing
        System.out.println("First element: " + deque.getFirst());  // Retrieves first element
        System.out.println("Last element: " + deque.getLast());    // Retrieves last element

        // Removing elements
        deque.removeFirst();  // Removes the first element
        deque.removeLast();   // Removes the last element

        // Displaying the deque after removal
        System.out.println("Deque after removal: " + deque);
    }
}

    

