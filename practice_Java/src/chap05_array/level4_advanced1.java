package chap05_array;

import java.util.Arrays;

public class level4_advanced1 {
    public static void main(String[] args) {
        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */

        int[] lotto = new int[6]; // 로또 6자리 배열 생성

        label:
        for (int i = 0; i < lotto.length; i++) {
            int lNum = 0; // 로또 번호 변수 선언 및 초기화
            while (true) {  // 무한 루프
                lNum = (int) (Math.random() * 45) + 1; // 로또 번호 생성
                for(int rand : lotto){ // 로또 번호 배열 내 값들을 하나씩 가져옴
                    if (lNum == rand){ // 배열 내 값들과 중복 값이 있다면
                        continue label; // 지정된 label로 반복문 탈출
                    }
                }
                break; // 배열 내 중복 값이 없다면 무한 루프 탈출
            }
            lotto[i] = lNum; // 중복 값 확인 과정 후 나온 랜덤 값을 배열 내 값으로 대입
        }

        Arrays.sort(lotto); // 오름차순 정렬

        for (int i : lotto) { // 로또 배열 값을 하나씩 가져와서
            System.out.print(i + " "); // 출력
        }


    }
}
