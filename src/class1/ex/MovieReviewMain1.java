package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 회전목마";

        MovieReview avengers = new MovieReview();
        avengers.title = "어벤저스";
        avengers.review = "3000만큼 사랑해";

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + avengers.title + ", 리뷰: " + avengers.review);
    }
}
