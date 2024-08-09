package chap10_exception.com.ohgiraffers.level01.basic1;

public class DoNotZero extends ArithmeticException {
    public DoNotZero(String message) {
        super(message);
    }
}
