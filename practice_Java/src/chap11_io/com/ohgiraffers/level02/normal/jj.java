package chap11_io.com.ohgiraffers.level02.normal;

import java.io.*;
import java.util.Scanner;

public class jj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력: ");
        int fileCount = scanner.nextInt();

        String[] fileNames = new String[fileCount];
        for (int i = 0; i < fileCount; i++) {
            System.out.print((i + 1) + " 번째 파일 이름 입력: ");
            fileNames[i] = scanner.next();
        }

        System.out.print("병합 될 파일명 입력: ");
        String resultFileName = scanner.next();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(resultFileName))) {
            for (String fileName : fileNames) {
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("오류: " + fileName + " (지정된 파일을 찾을 수 없습니다)");
                    return;
                }
            }
            System.out.println("파일 병합이 완료되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
