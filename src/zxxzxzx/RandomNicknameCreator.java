package zxxzxzx;

import java.util.Random;

public class RandomNicknameCreator {

    private String[] firstList = {"기철초풍", "멋있는", "재미있는"};
    private String[] secondList = {"도전적인", "노란색의", "바보같은"};
    private String[] thirdList = {"돌고래", "개발자", "오랑우탄"};

    public String createRandomNickname() {
        // 여기에 랜덤으로 닉네임을 만드는 코드를 적어주세요
        Random random = new Random();

        // 각 리스트에서 무작위로 하나의 값을 선택
        String first = firstList[random.nextInt(firstList.length)];
        String second = secondList[random.nextInt(secondList.length)];
        String third = thirdList[random.nextInt(thirdList.length)];

        // 선택된 단어들을 합쳐서 닉네임을 생성
        return first + " " + second + " " + third;

    }

    public static void main(String[] args) {
        RandomNicknameCreator randomNicknameCreator = new RandomNicknameCreator();
        String myNickname = randomNicknameCreator.createRandomNickname();
        System.out.println(myNickname);
    }
}