package rshv.samplespringboot.exception;

public class BookIdMismatchException extends RuntimeException {

    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}

