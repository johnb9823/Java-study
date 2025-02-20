package pack.b;

public class User {

    public User(){ // 다른 패키지에서 이 클래스의 생성자를 호출하려면 public을 사용해야한다.
        System.out.println("패키지 pack.b 회원 생성");
    }
}
