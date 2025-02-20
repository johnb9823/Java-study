package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10,20);
        System.out.println("ClassC 생성자");

        //ClassB에는 기본 생성자가 없다.
        //그래서 super(10,20); 처럼 매개변수 파라미터를 직접 넣어줘야한다.
    }


}
