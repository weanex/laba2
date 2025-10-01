package n6.exceptions;

public class NegativeRadiusException extends IllegalArgumentException {
    public NegativeRadiusException(String message) {
        super(message);
    }
}