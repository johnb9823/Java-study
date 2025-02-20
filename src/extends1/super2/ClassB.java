package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        //super(); // 기본생성자 생략 가능
        //ClassA가 기본생성자라면 생략 가능하다
        this(a, 0);
        //this를 만나면 나의 생성자 말고 다른 생성자를 먼저 사용해줘라고 하면서
        // 아래에 있는 ClassB(int a, int b) 생성자로 간다.
        System.out.println("ClassB 생성자 a = " + a);
        //this가 100개가 있어도 마지막엔 무조건 super를 만나게 되어있다.
        // 절대 super를 안할수는 없다(컴파일 오류남)
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a =" + a +"b = " + b);
    }
}
