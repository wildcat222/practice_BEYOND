package chap04_control_flow;

import java.util.Scanner;

public class level1_basic4 {
    public static void main(String[] args) {
        /* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 1부터 5까지의 합 : 15
         *
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("1부터 " + a + "까지의 합 : " + sum);

    }
}
