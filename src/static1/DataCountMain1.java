package static1;

public class DataCountMain1 {

    public static void main(String[] args) {

        Data1 data1 = new Data1("A");
        System.out.println("A count= " +data1.count);
        System.out.println(data1);


        Data1 data2 = new Data1("B");
        System.out.println("B count= " +data2.count);
        System.out.println(data2);

        Data1 data3 = new Data1("C");
        System.out.println("C count= " +data3.count);

        //새로운 인스턴스가 생성되기 때문에 count가 증가하지 않는다
        // 그래서 참조값이 다른다.
    }

}
