package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        //부모타입은 자식타입을 담을 수 있다.
        Parent poly = new Child();
        poly.parentMethod(); // <- 이 코드의 poly는 Parent 타입이다.
        // Parent 타입은 본인의 메서드만 알고있다. 그래서 가능함
        //Parent poly = new Child(); 이렇게 코드를 작성하면
        // 메모리상에는 parentMethod(), childMethod() 가 있지만
        // poly 변수는 Parent 타입이라서 먼저 parentMethod() 부터 참조? 시작? 한다.
        // 그런데 메모리 상에 childMethod() 도 있는데 왜 왜 왜 컴파일 오류가 발생할까?
        // 상속 관계는 부모 방향으로 찾아 올라갈 수는 있지만 자식 방향으로 찾아 내려갈 수는 없다.
        // Parent 는 부모 타입이고 상위에 부모가 없다.
        // 따라서 childMethod() 를 찾을 수 없으므로 컴파일 오류가 발생한다.
        // ploy.childMethod() 를 호출하고 싶으면 캐스팅이 필요하다!!

        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다.

        //poly.childMethod();
        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생

        //**다형적 참조**
//        Parent poly = new Parent();
//        Parent poly = new Child();
//        Parent poly = new Grandson(); Child 하위에 손자가 있다면 가능
//        자바에서 부모 타입은 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
//        이것이 바로 다양한 형태를 참조할 수 있다고 해서 다형적 참조라 한다.


    }
}
