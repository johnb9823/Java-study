package static2;

//import static static2.DecoData.staticCall; //메서드 지정
//import static static2.DecoData.*; // 모든 메서드

//import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {

        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        //import static을 하면
        // staticCall(); 이렇게 바로 쓸 수 있다


        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출1");
        DecoData data2 = new DecoData();
        data2.instanceCall();
        // 인스턴스의 값은 다시 생성되니까 1이지만
        // 스태틱은 원래 클래스 레벨에 있었기에 값이 3이 됨

        System.out.println();

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
