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

        double x = 0;
        try {
            x = new Application().Divide();
            System.out.println(x);
        } catch (DoNotZero | insertInt e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }
    }

    public double Divide() throws DoNotZero {
        Scanner sc = new Scanner(System.in);
        double n = 0;

        try {
            System.out.print("분자 입력 : ");
            int soon = sc.nextInt();
            System.out.print("분모 입력 : ");
            int mother = sc.nextInt();
            n = (double) (soon / mother);
        } catch (ArithmeticException e) {
            throw new DoNotZero("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        } catch (InputMismatchException e) {
            throw new insertInt("오류 : 유효한 정수를 입력하세요.");
        }
        return n;
    }

}
