package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 회전목마";
        reviews[0] = inception;

        MovieReview avengers = new MovieReview();
        avengers.title = "어벤저스";
        avengers.review = "3000만큼 사랑해";
        reviews[1] = avengers;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
