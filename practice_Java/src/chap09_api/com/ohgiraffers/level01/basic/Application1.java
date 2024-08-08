package chap09_api.com.ohgiraffers.level01.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String[] input = sc.nextLine().split(" ");

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < input.length; i++){
            builder.append(String.valueOf(input[i].charAt(0)).toUpperCase());
        }


    }

}
