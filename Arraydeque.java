
import java.util.ArrayDeque;
public class Arraydeque {
   
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10); 
        deque.addLast(20);  
        deque.addLast(30);

        
        System.out.println( deque);

        
        System.out.println( deque.getFirst());  
        System.out.println( deque.getLast());    

        
        deque.removeFirst();  // Removes the first element
       // deque.removeLast();   // Removes the last element
        System.out.println(deque.	peek());

       
        System.out.println(  deque);
    }
}

    

