/**
 * Custom exception thrown when trying to push onto a full stack.
 */
class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}
