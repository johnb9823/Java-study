package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {
            //                Child child 이렇게 바로 변수를 쓸수 있는 것은
            //                자바 16버전 이상에서 사용가능함
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }

}
