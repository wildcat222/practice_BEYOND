package chap13_collection.com.ohgiraffers.level1.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList scores = new ArrayList();

        char y = 0;
        do {
            System.out.print("학생 성적 : ");
            scores.add(sc.nextInt());
            System.out.print("추가 입력하려면 y : ");
            y = sc.next().charAt(0);
        } while (y == 'y');

        double total = 0;
        for (int i = 0; i < scores.size(); i++) {
            total += (double) scores.get(i);
        }

        System.out.println("학생 인원 : " + scores.size());
        System.out.println("평균 점수 : " + total / scores.size());


    }
}
