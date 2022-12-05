package co.com.tevolvers.test.exceptions;

public class UnexpectedPrice extends AssertionError{
    public static final String PRICE = "The prices do not match";
    public UnexpectedPrice(String message, Throwable cause){
        super(message, cause);
    }
}
