package chpa08_polymorphism.com.ohgiraffers.level01.basic;

public class Circle extends Shape implements Resizable {

    private double radious;
    // 생성자
    public Circle(double radius) {
        this.radious = radius;
    }


    @Override
    public void resize(double factor) {
        radious *= factor;
    }

    @Override
    double calculateArea() {
        return Math.PI * (radious * radious);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radious;
    }
}
