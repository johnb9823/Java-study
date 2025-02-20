package class1;

public class ClassStart3 {

    public static void main(String[] args) {

        Student student1;
        student1 = new Student();
        student1.name = "홍길동";
        student1.age = 23;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "기기길";
        student2.age = 15;
        student2.grade = 90;

        System.out.println(student1.name + " 나이: "+ student1.age + " 성적: " +student1.grade);
        System.out.println(student2.name  + " 나이: " + student2.age + " 성적: " + student2.grade);

    }
}
