package chap10_exception.com.ohgiraffers.level01.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("분자 입력 : ");
            int soon = sc.nextInt();
            System.out.print("분모 입력 : ");
            int mother = sc.nextInt();

            new Application().Divide(soon, mother);

        } catch (DoNotZero e) {
            System.out.println(e.getMessage());
        }


    }

    public double Divide(int soon, int mother) throws DoNotZero {

        try {
            int n = soon / mother;
        } catch (ArithmeticException e) {
            throw new DoNotZero("오류 : ~~~");
        }


        return (double) soon / mother;
    }

}
