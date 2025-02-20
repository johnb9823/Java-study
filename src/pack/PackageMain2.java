package pack;

import pack.a.*; //이렇게 쓸 경우
// pack.a. 패키지 내의 전체 클래스를 끌어다 사용가능

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import 사용으로 패키지 명 생략 가능
        User2 user2 = new User2();
    }
}
