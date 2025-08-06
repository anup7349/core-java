class Book11 {
    private String title;
    private String author;
    private int pages;
    private double price;
    private boolean isAvailable;

    public Book11() {
    }

    public Book11(String title) {
        this.title = title;
    }

    public Book11(String title, String author) {
        this(title);
        this.author = author;
    }

    public Book11(String title, String author, int pages) {
        this(title, author);
        this.pages = pages;
    }

    public Book11(String title, String author, int pages, double price) {
        this(title, author, pages);
        this.price = price;
    }

    public Book11(String title, String author, int pages, double price, boolean isAvailable) {
        this(title, author, pages, price);
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
