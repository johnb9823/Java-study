package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {
    //새는 AbstractAnimal 클래스를 상속 받고, Fly 인터페이스를 구현한다.
    // 상속은 무조건 하나만 가능하고 구현은 여러개 할 수 있다.
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
