package demo.ss0_b.exception;

public class NotFoundBankAccountException extends Exception{
    public NotFoundBankAccountException(String message){
        super(message);
    }
}
