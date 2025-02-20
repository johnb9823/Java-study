package construct.ex;

public class Book {

    String title;
    String author;
    int page;

    Book() {
        this("","",0);
//        this.title ="";
//        this.author ="";
        // 빈 문자를 안 만들어주면 null 값이 나오므로
        // null값이 안 나오도록 만들어줌
    }

    Book(String title ,String author) {
        this(title, author,0);
        // 중복을 없애기 위한 방법
//        this.title = title;
//        this.author = author;
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }


}
