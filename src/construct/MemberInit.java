package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit() { //r

    }

    //추가
    void initMember(String name, int age, int grade){
        this.name = name;
        // x001.name = name 즉, MemberInit 필드의 name에 접근하게 된다.
        this.age = age;
        this.grade = grade;
    }
    // 멤버변수에 접근하려면 앞에 this. 이라고 해주면 된다.
    // 여기서 this는 인스턴스 자신의 참조값을 가리킨다.

}
