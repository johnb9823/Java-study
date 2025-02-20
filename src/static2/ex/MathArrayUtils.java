package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 메인 클래스에서 생성자를 못 만들게 private으로 막는다
        //private를 사용해서 메인 클래스에서 MathArrayUtils()의 (객체) 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
//        for (int i = 0; i < values.length; i++) {
//            total =+ values[i];
//        } 이거 안됨
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
