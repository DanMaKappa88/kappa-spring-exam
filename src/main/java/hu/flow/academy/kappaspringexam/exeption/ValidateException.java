package hu.flow.academy.kappaspringexam.exeption;

public class ValidateException extends RuntimeException {

    public ValidateException(String msg) {
        super(msg);
    }
}