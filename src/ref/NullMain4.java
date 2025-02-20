package ref;

public class NullMain4 {

    public static void main(String[] args) {

        BigData bigData = new BigData(); // x001
        bigData.data = new Data(); //BigData 클래스 안 필드에 data 클래스가 들어 있기 때문에 이렇게 Data 객체를 생성 가능

        System.out.println("bigData count = " + bigData.count);
        System.out.println("bigData data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value); // 객체만 생성하고 초기화 하지 않았기에 0이 나옴

        //nullpointexcpetion이 발생하면 null 값에 .(dot) 을 찍었다고 생각하면 문제를 쉽게 해결 가능
    }
}
