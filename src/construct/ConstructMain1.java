package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        // command + p = 생성자 파라미터에 뭐가 필요한지 보임
        // 생성자의 매개변수는 무조건 필수로 호출 해야함
        // 생성자에서는 보통 필수값을 받아줌
        MemberConstruct member1 = new MemberConstruct("user1" , 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2" , 16, 90);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age +" 성적: "+ s.grade);

        }
    }
}
