import java.util.LinkedList;

// LinkedList -> linear data structure where each element (node) points to the next one
class LinkedListExample{
    public static void main(String[] args){
        LinkedList<Integer> myLinkedList = new LinkedList<>();

        // we can implement all Stack, Queue, and Deque operations in one data structure
        myLinkedList.add(10);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(20);

        System.out.println(myLinkedList); // Output: [5, 10, 20]
        
        myLinkedList.pop();
        System.out.println(myLinkedList); // Output: [10, 20]

        System.out.println(myLinkedList.removeLast());
    }
}
