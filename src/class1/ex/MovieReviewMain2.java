package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        //배열을 도입하고, 영화리뷰를 배열에 관리하자
        MovieReview[] mrArray = new MovieReview[2];

        MovieReview mr1 = new MovieReview();
        mr1.title = "인셉션";
        mr1.review = "인생은 무한 루프";
        mrArray[0] = mr1;

        MovieReview mr2 = new MovieReview();
        mr2.title = "어바웃 타임";
        mr2.review ="인생 시간 영화";
        mrArray[1] = mr2;

        for(int i = 0; i < mrArray.length; i++) {
            MovieReview m = mrArray[i];
            System.out.println("영화 제목: " + m.title + ", 리뷰 : " + m.review);
        }

    }
}
