package extends1.overriding;

public class ElectricCar extends Car {
    //오버라이딩 => 부모클래스의 move() 메소드가 마음에 들지 않아서
    // 자식클래스에서 직접 재정의 하고싶을 때 어노테이션Override를 쓰면
    // 이름이 같은 메소드를 만들고 재정의 할 수 있다.
    // 즉 ElectricCar 객체에서 move() 메소드를 사용하면
    // 전기차를 빠르게 이동합니다. 라고 나옵니다.
    // 애노테이션을 스킵해도 되지만 개발자들은 꼭 사용한다.(실수를 방지하기 위해서 무조건 쓰자)
    // 오버라이드하면 리턴 타입까지 맞춰야함


    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
