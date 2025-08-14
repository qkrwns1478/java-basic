package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("강아지를 위한 JPA 프로그래밍", "munsik22", 215);
        Book book2 = new Book("초신성의 후예", "이석영");
        Book book3 = new Book();

        Book[] books = {book1, book2, book3};
        for (Book b : books) {
            b.displayInfo();
        }
    }
}
