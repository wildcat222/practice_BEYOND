package chap13_collection.com.ohgiraffers.level1.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
//        최근 방문 url : [https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
//        최근 방문 url : [https://github.com/, https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.notion.so/
//        최근 방문 url : [https://www.notion.so/, https://github.com/, https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.naver.com/
//        최근 방문 url : [https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
//        최근 방문 url : [https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
//        최근 방문 url : [https://www.google.com/, https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/]
//        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : exit

        Scanner sc = new Scanner(System.in);
        Stack<String> urls = new Stack<>();

        String url = "";
        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            url = sc.nextLine();
            if (url.equals("exit")) break;
            urls.push(url);


            if (urls.size() >= 5) {
                for (int i = urls.size() - 1; i >= urls.size() - 5 ; i--) {
                    System.out.println(Arrays.toString(urls.get(urls.size()).split(",")));
                }
            } else if (urls.size() < 5) {
                for (int i = urls.size() - 1; i >= urls.size(); i--) {
                    System.out.println(Arrays.toString(urls.get(i).split(",")));
                }
            }
        }






    }
}
