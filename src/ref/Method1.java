package ref;

public class Method1 {

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        initStudent(student1,"홍길동", 18, 90);

        // shift + f6 변수명을 한번에 바꿀 수 있음
        Student student2 = new Student();
        initStudent(student2,"홍길동동", 15, 80);

        printStudent(student1);
        printStudent(student2);

    }




}
