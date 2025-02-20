package static1;

public class Data3 {

    public String name;
    public static int count;
    // 멤버변수에 static을 붙이면 static 변수, 정적변수, 또는 클래스 변수로 불린다.

    public Data3(String name) {
        this.name = name;
        count++;
        // Data3.count++; 이렇게 접근해야되지만
        // 같은 클래스 내에 있기에 바로 count++; 가능
    }
}
