package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data();
        //같은 패키지 안에 있을 경우 경우 경로 생략 가능
        pack.a.User user = new pack.a.User();
        // 패키지 위치가 다르면 pack.a.User 와 같이 패키지의
        // 전체 경로를 포함하여 클래스를 적어줘야 한다.
        // 불편해서 import를 씀
    }
}
