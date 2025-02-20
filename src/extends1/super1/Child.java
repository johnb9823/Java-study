package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value); //this 생략가능 //자기 자신
        System.out.println("super value = " + super.value); // 부모에서 찾는거

        this.hello();
        super.hello();
    }
}
