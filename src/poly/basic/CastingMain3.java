package poly.basic;


// upcasting VS downcasting
public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = (Parent) child; //(Parent)생략가능 업캐스팅이라서, 생략 권장
        Parent parent2 = child;
        // 부모는 마음이 넓어서 자식을 품을 수 있으니까
        // 업캐스팅은 생략가능, 다운캐스팅은 생략 불가능.
        // 업캐스팅은 매우 자주 사용하기 때문에 생략 가능하다

        parent1.parentMethod();
        parent2.parentMethod();
    }

}
