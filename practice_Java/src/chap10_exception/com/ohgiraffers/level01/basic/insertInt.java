package chap10_exception.com.ohgiraffers.level01.basic;

import java.util.InputMismatchException;

public class insertInt extends InputMismatchException {
    public insertInt(String message) {
        super(message);
    }
}
