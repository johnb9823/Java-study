package poly.basic;


// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child = (Child) parent1;
        child.childMethod(); //문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
        child2.childMethod(); //실행 불가

        // *컴파일 오류 vs 런타임 오류**
        // 컴파일 오류는 변수명 오타, 잘못된 클래스 이름 사용등 자바 프로그램을 실행하기 전에 발생하는 오류이다.
        // 이런 오류는 IDE 에서 즉시 확인할 수 있기 때문에 안전하고 좋은 오류이다.
        // 반면에 런타임 오류는 이름 그대로 프로그램이 실행되고 있는 시점에 발생하는 오류이다.
        // 런타임 오류는 매우 안좋은 오류이다.
        // 왜냐하면 보통 고객이 해당 프로그램을 실행하는 도중에 발생하기 때문이다.
    }
}
