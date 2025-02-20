package poly.ex4;

public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();
    //추상 매서드라서 메서드 바디를 못 만든다.
    // 추상 클래스에 추상 메서드만 있는 것을 순수추상 클래스라고 한다.
    // 단지 다형성을 위한 부모타입으로써 껍데기만 제공을 할 뿐이다.
    //주로 다형성을 위해 사용된다.
}
