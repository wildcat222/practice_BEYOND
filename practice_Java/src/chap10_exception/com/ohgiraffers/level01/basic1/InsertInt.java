package chap10_exception.com.ohgiraffers.level01.basic1;

import java.util.InputMismatchException;

public class InsertInt extends InputMismatchException {
    public InsertInt(String message) {
        super(message);
    }
}

