import java.util.Deque;
import java.util.ArrayDeque;

class DequeExample{
    public static void main(String[] args){
        // allows inserting and removing elements from both ends
        Deque<Integer> deque = new ArrayDeque<>(); // fast, efficient deque

        deque.add(20);
        deque.add(30);
        System.out.println(deque); // Output: [20, 30]

        deque.addFirst(10);
        deque.addLast(40);

        System.out.println(deque); // Output: [10, 20, 30, 40]
        
        // Similarly we can remove elements from both first and Last
        System.out.println(deque.removeLast());
    }
}
