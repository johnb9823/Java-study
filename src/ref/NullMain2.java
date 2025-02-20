package ref;

public class NullMain2 {

    public static void main(String[] args) {

        Data data = null;
        data.value = 10; //NullPointerException 예외 발생
        //예외가 발생 되면 아래의 코드는 실행되지 않고 밖으로 나간다.
        System.out.println("data =" + data.value);

    }
}
