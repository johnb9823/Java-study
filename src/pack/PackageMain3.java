package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // 클래스 명이 같은 같고 패지키는 다를경우
        // 하나는 import하고 나머지 하나는 경로 전체를 써줘야한다.
    }
}
