package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;
    }
    // 필드의 변수와 매개변수의 변수가 다르면
    // (this. 이 생략 가능함)nameField = nameParameter; 이렇게 바로 적을 수 있음
    // 메소드 매개변수에서 클래스의 멤버변수에(필드) 접근할 때는
    // 무조건 this.을 적어주는 코딩스타일이 잇다
}
