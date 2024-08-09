package chap11_io.com.ohgiraffers.level02.normal;

import java.awt.image.DataBufferInt;
import java.io.*;
import java.nio.Buffer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        여러 개의 텍스트 파일을 하나의 파일로 병합하는 프로그램을 작성한다.
        이 때 BufferedReader와 BufferedWriter를 사용하여 작성한다.

        ===== 입출력 예시 =====
        병합할 파일의 개수 입력 : 3
        1 번째 파일 이름 입력 : test.txt
        2 번째 파일 이름 입력 : test2.txt
        3 번째 파일 이름 입력 : test3.txt
        병합 될 파일명 입력 : result.txt
        파일 병합이 완료 되었습니다.

        병합할 파일의 개수 입력 : 2
        1 번째 파일 이름 입력 : test.txt
        2 번째 파일 이름 입력 : test4.txt
        병합 될 파일명 입력 : result.txt
        오류 : test4.txt (지정된 파일을 찾을 수 없습니다)
        */


        try {
            System.out.println("병합할 파일의 개수 입력 : ");
            Scanner sc = new Scanner(System.in);
            int fCnt = sc.nextInt();
            String[] fNames = new String[fCnt];

            for (int i = 0; i < fCnt; i++) {
                System.out.println(fCnt + "번째 파일 이름 입력 : ");
                String fName = sc.next();
                fNames[i] = fName;
            }














        } catch (InputMismatchException e) {
            e.printStackTrace();
        }



    }
}