/**
 * A generic stack implementation using an object array.
 * Throws StackFullException if capacity is exceeded.
 * Throws StackEmptyException if popping or peeking an empty stack.
 * @author Stefan Crasnianec , Luca Weinberger
 * @version 1.0
 */
public class Stack<T> {
    private Object[] elements; // Array to store elements
    private int size;          // Current number of elements
    private int capacity;      // Maximum capacity of the stack

    /**
     * Default constructor initializing stack with capacity 10.
     */
    public Stack() {
        this.capacity = 10;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    /**
     * Constructor with user-defined capacity.
     *
     * @param capacity The maximum number of elements the stack can hold
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param item The item to push onto the stack
     * @throws StackFullException if the stack is full
     */
    public void push(T item) throws StackFullException {
        if (size >= capacity) {
            throw new StackFullException("Stack is full");
        }
        elements[size++] = item;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return The top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T pop() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[--size];
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return The top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[size - 1];
    }

    /**
     * Returns a string representation of the stack elements.
     * Elements are separated by ';'
     *
     * @return A string containing all elements of the stack
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}

