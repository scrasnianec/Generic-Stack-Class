/**
 * Custom exception thrown when trying to pop or peek from an empty stack.
 */
class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}
