package static2.ex;

import static static2.ex.MathArrayUtils.*;
//메인의 프린프문에서
// 클래스명을 없애줄 수 있다.
// MeathArrayUtils.sum(values) 말고 클래스 명을 지우고
// sum(values) 라고 쓸 수 있게 됨.

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
