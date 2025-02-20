package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter() {

    }

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; // else문으로 못 내려가게 막음
            // return를 만나면 빠져나감
        }
        //실행로직
        count++;
    }
    public int getCount(){
        return count;
    }

}
