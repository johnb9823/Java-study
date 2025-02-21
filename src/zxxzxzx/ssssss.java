package zxxzxzx;

    public class ssssss {

        public int solution(int angle) {
            if (angle > 0 && angle < 90) {
                return 1; // 예각
            } else if (angle == 90) {
                return 2; // 직각
            } else if (angle > 90 && angle < 180) {
                return 3; // 둔각
            } else if (angle == 180) {
                return 4; // 평각
            } else {
                return -1; // 유효하지 않은 각도
            }
        }

        public static void main(String[] args) {
            ssssss s = new ssssss();
            System.out.println(s.solution(45));  // 예각
            System.out.println(s.solution(90));  // 직각
            System.out.println(s.solution(135)); // 둔각
        }
    }
