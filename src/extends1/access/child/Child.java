package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; //상속 관계 or 같은 패키지
        //defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
        //privateValue = 1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //상속 관계 or 같은 패키지
        //defaultMethod(); //다른 패키지 접근 불가, 컴파일 오류
        //privateMethod(); //접근 불가, 컴파일 오류

        printParent();
        //이 코드는 public 으로 만들어져서 접근 가능하고
        // 부모클래스로 이동후 printParent()를 실행하면
        // private, default, protected, public 안에 뭐가 들어있는지 확인 가능하다
    }
}
