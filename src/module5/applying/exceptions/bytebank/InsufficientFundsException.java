package module5.applying.exceptions.bytebank;

public class InsufficientFundsException extends Exception {
    //RuntimeException - unchecked - compilador não verifica
    //Exception - checked - compilador verifica
    public InsufficientFundsException(String message) {
        super(message);
    }
}
