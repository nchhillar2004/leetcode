import java.util.Stack;

// Stack Data Structure
// use Deque (Double-Ended Queue) for more efficient implementations
class StackDs{
    public static void main(String[] args){
        // LIFO -> Last in First out
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack); // [10, 20, 30]

        myStack.pop(); // remove the top element

        System.out.println(myStack); // [10, 20]
        System.out.println(myStack.peek()); // see the top element, i.e '20' here
        System.out.println(myStack.isEmpty()); // check if empty
    }
}
