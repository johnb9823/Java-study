package static1;

public class DataCountMain3 {

    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);
        //Data3.count 처럼 count는 static 변수라서 클래스에서 바로 접근 가능하다(클래스변수)

        Data3 data2 = new Data3("B");
        System.out.println("A count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("A count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근 가능하지만 권장하지 않는다
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        //딱보면 인스턴스 변수라고 생각할 수 있기에 권장하지 않는다

        //클래스를 통한 접근
        System.out.println(Data3.count);
        // 이것을 보면 바로 딱 클래스 변수라는 것을 알 수 있다
    }
}
