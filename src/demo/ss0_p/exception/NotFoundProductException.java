package demo.ss0_p.exception;

public class NotFoundProductException extends Exception{
    public NotFoundProductException(String message) {
        super(message);
    }
}
