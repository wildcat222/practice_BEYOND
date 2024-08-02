package chap04_control_flow;

import java.util.Scanner;

public class lever4_advanced4 {
    public static void main(String[] args) {
        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요 : ");
        int pay = sc.nextInt();

        System.out.print("상품 가격을 입력하세요 : ");
        int prodoct_price = sc.nextInt();

        int chg = pay - prodoct_price;
        int fifty_thousand = chg / 50000;
        chg %= 50000;
        int ten_thousand = chg / 10000;
        chg %= 10000;
        int five_thousand = chg / 5000;
        chg %= 5000;
        int thousand = chg / 1000;
        chg %= 1000;
        int five_hundred = chg / 500;
        chg %= 500;
        int hundred  = chg / 100;
        chg %= 100;
        int fifty = chg / 50;
        chg %= 50;
        int ten = chg / 10;

        System.out.println("50000원권 지폐" + fifty_thousand +"장");
        System.out.println("10000원권 지폐" + ten_thousand +"장");
        System.out.println("5000원권 지폐" + five_thousand +"장");
        System.out.println("1000원권 지폐" + thousand +"장");
        System.out.println("500원권 동전" + five_hundred +"장");
        System.out.println("100원권 동전" + hundred +"장");
        System.out.println("50원권 동전" + fifty +"장");
        System.out.println("10원권 동전" + ten +"장");
        System.out.println("거스름돈 : "+ (pay - prodoct_price) + "원");

    }



}
