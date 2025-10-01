package n6.exceptions;

public class NegativeHeightException extends IllegalArgumentException {
    public NegativeHeightException(String message) {
        super(message);
    }
}