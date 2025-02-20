package class1;

public class ClassStart5 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "홍길동";
        student1.age = 23;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "기기길";
        student2.age = 15;
        student2.grade = 90;

        Student[] students = {student1, student2};

        for(int i =0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: "+ students[i].age + " 성적: " +students[i].grade);


        }
        for(int i =0; i < students.length; i++) {
            Student s = students[i]; //변수를 하나 선언해서 짧게 적을 수 있음
            System.out.println("이름: " + s.name + " 나이: "+ s.age + " 성적: " +s.grade);

        }

        for (Student s : students) { //향상된 for문으로 사용가능 iter
            System.out.println("이름: " + s.name + " 나이: "+ s.age + " 성적: " +s.grade);
        }
        
    }
}
