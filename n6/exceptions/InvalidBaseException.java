package n6.exceptions;

public class InvalidBaseException extends IllegalArgumentException {
    public InvalidBaseException(String message) {
        super(message);
    }
}