package ir.phgint;

public class StringLengthException extends RuntimeException {
    public StringLengthException(String message) {
        super(message);
    }

    public StringLengthException() {
        super();
    }
}