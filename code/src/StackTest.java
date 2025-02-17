/**
 * A test class for Stack<T> demonstrating its functionality.
 */
public class StackTest {
    public static void main(String[] args) {
        try {
            // stack with Integer values
            Stack<Integer> numberStack = new Stack<>(5);
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Number Stack List: " + numberStack.list()); // Expected: 10;20;30
            System.out.println("Popped: " + numberStack.pop()); // Expected: 30
            System.out.println("Peek: " + numberStack.peek()); // Expected: 20

            // stack with String values
            Stack<String> textStack = new Stack<>(3);
            textStack.push("Apple");
            textStack.push("Banana");
            textStack.push("Cherry");
            System.out.println("Text Stack List: " + textStack.list()); // Expected: Apple;Banana;Cherry
            System.out.println("Popped: " + textStack.pop()); // Expected: Cherry
            System.out.println("Peek: " + textStack.peek()); // Expected: Banana

            // exception handling
            Stack<Integer> emptyStack = new Stack<>(2);
            emptyStack.pop(); // should throw StackEmptyException

        } catch (StackFullException | StackEmptyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
