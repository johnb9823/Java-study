package oop1.ex;

public class Rectangle {

    int width;
    int height;

    //메서드 만들 때 매개변수 필요없음

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

//    void Area() {
//        int area = width * height;
//        System.out.println("넓이: " + area);
//    }
//
//    void Perimeter() {
//        int perimeter = 2 * (width + height);
//        System.out.println("둘레 길이: " + perimeter);
//    }
//
//    void isSquare() {
//        boolean result = width == height;
//        System.out.println("정사각형 여부: " + result);
//
//    }
}
