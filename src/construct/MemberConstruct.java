package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    //추가 생성자 오버로딩
    MemberConstruct(String name, int age) {
        this(name,age,50); //변경 가능
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        //생성자 매개변수에 grade 값을 안 넣을 경우 기본으로 grade는 50점이 된다는 뜻
    }

    //생성자 (첫글자 대문자로 시작함)
    // 생성자 이름은 항상 클래스 이름과 같아야함
    // 다르면 컴파일 오류남
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name +" , age= " + age +" ,grade="  + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
