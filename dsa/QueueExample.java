import java.util.LinkedList;
import java.util.Queue;

// FIFO First in First Out
class QueueExample{
    public static void main(String[] args){
        // Queue is an interface, not a concrete class
        // So, concrete class like 'LinkedList, PriorityQueue & ArrayDeque' implements the 'Queue' interface
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);
        
        // Dequeue elements
        System.out.println(queue.poll());  // Output: 1
        System.out.println(queue.poll());  // Output: 2
        
        // Peek front element
        System.out.println(queue.peek());  // Output: 3
    }
}
