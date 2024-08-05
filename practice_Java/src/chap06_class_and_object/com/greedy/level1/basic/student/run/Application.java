package chap06_class_and_object.com.greedy.level1.basic.student.run;

import chap06_class_and_object.com.greedy.level1.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentDTO[] students = new StudentDTO[10];
        int student = 0; // 객체 생성된 학생 수 카운트

        while(true) {   // 학생 정보 입력받음
            System.out.print("학년 : ");
            int grade = scanner.nextInt();
            System.out.print("반 : ");
            int classroom = scanner.nextInt();
            System.out.print("이름 : ");
            String name = scanner.next();
            System.out.print("국어 점수 : ");
            int kor = scanner.nextInt();
            System.out.print("영어 점수 : ");
            int eng = scanner.nextInt();
            System.out.print("수학 점수 : ");
            int math = scanner.nextInt();

            students[student] = new StudentDTO(grade, classroom, name, kor, eng, math); // 입력받은 정보로 객체 생성
            student++; // 생성된 학생 수 카운트 +1

            if (student < 10) { // 최대 10명까지 객체 추가 조건
                System.out.println("계속 추가하시겠습니까?");
                char answer = scanner.next().charAt(0);
                if (answer == 'Y' || answer == 'y') {
                    continue;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < student; i++) { // 생성된 객체만큼 정보 출력
            System.out.println(students[i].getInformation());
        }

    }

}
