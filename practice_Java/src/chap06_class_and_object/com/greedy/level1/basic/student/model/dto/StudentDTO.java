package chap06_class_and_object.com.greedy.level1.basic.student.model.dto;

public class StudentDTO {
    // 필드
    private int grade;      // 학년
    private int classroom;  // 반
    private String name;    // 이름
    private int kor;        // 국어 점수
    private int eng;        // 영어 점수
    private int math;       // 수학 점수

    // 생성자
    public StudentDTO() {}

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 메소드
    public String getInformation() {
        return "학년=" + grade + ", "
                + "반=" + classroom + ", "
                + "이름=" + name + ", "
                + "국어=" + kor + ", "
                + "영어=" + eng + ", "
                + "수학=" + math + ", "
                + "평균=" + (kor + eng + math / 3);
    }

}
