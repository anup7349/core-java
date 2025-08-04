public class Book1Runnerr {
    public static void main(String[] args) {
        Book1[] books = new Book1[5];

        Book1 b1 = new Book1();
        b1.setTitle("The Alchemist");
        b1.setAuthor("Paulo Coelho");
        b1.setPages(208);
        books[0] = b1;

        Book1 b2 = new Book1();
        b2.setTitle("Wings of Fire");
        b2.setAuthor("A.P.J. Abdul Kalam");
        b2.setPages(180);
        books[1] = b2;

        Book1 b3 = new Book1();
        b3.setTitle("Harry Potter");
        b3.setAuthor("J.K. Rowling");
        b3.setPages(350);
        books[2] = b3;

        Book1 b4 = new Book1();
        b4.setTitle("Rich Dad Poor Dad");
        b4.setAuthor("Robert Kiyosaki");
        b4.setPages(200);
        books[3] = b4;

        Book1 b5 = new Book1();
        b5.setTitle("Atomic Habits");
        b5.setAuthor("James Clear");
        b5.setPages(250);
        books[4] = b5;

		for (int i = 0; i < books.length; i++) {
            Book1 currentBook = books[i];
            System.out.println("Title: " + currentBook.getTitle());
            System.out.println("Author: " + currentBook.getAuthor());
            System.out.println("Pages: " + currentBook.getPages());
            System.out.println("------------------------");
        }
    }
}