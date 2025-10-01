package n6.exceptions;

public class NegativeSizeException extends IllegalArgumentException {
    public NegativeSizeException(String message) {
        super(message);
    }
}