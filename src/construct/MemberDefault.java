package construct;

public class MemberDefault {

    String name;

    MemberDefault() { // 자바는 자동으로 기본생성자를 만들어준다.
        // 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다.
        // 이 경우 개발자가 정의한 생성자를 직접 호출해야한다.
        System.out.println("생성자 호출");
    }

}
