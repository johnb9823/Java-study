package ref;

public class NullMain3 {

    public static void main(String[] args) {

        BigData bigData = new BigData(); // x001
        System.out.println("bigData count = " + bigData.count); //0 객체를 생성하고 초기화 하지 않으면 int는 0
        System.out.println("bigData data = " + bigData.data); //null 객체를 생성하고 초기화 하지 않으면 클래스는 자동으로 null값으로 초기화 된다.

        //NullPointException
        //                                          x001.null.value  이라서 예외 발생
        //참조할 곳이 없기 때문에 예외 발생함
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
