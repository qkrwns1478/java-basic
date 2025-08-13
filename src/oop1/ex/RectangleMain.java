package oop1.ex;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 5;
        rect.height = 8;

        int area = rect.getArea();
        System.out.println("넓이: " + area);

        int perimeter = rect.getPerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rect.isSquare();
        System.out.println("정사각형인가요? " + square);
    }
}
