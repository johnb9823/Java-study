package static2;

public class DecoUtil2 {

    public static String deco(String str) {
        // static이 붙으면 정적 메서드가 됨
        String result = "*" + str + "*";
        return result;
    }
}
