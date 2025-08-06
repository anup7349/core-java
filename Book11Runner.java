class Book11Runner {
    public static void main(String[] args) {
        Book1[] books = new Book1[5];

        books[0] = new Book11("The Alchemist", "Paulo Coelho", 208, 399.50, true);
        books[1] = new Book11("Wings of Fire", "A.P.J Abdul Kalam", 300, 299.00, true);
        books[2] = new Book11("Atomic Habits", "James Clear", 320, 499.99, true);
        books[3] = new Book11("1984", "George Orwell", 268, 350.00, false);
        books[4] = new Book11("Rich Dad Poor Dad", "Robert Kiyosaki", 280, 450.00, true);

        for (int i = 0; i < books.length; i++) {
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Pages: " + books[i].getPages());
            System.out.println("Price: ₹" + books[i].getPrice());
            System.out.println("Available: " + books[i].isAvailable());
          
        }
    }
}
