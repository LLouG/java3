package dayTwentyNine;

class Books {
    private String bookName;
    private String author;
    private int pages;

    public Books(String bookName) {
        this(bookName, "Unknown", 0);
    }

    public Books(String bookName, String author, int pages) {
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Book: " + this.bookName + "\nAuthor: " + this.author + "\nNumber of pages: " + this.pages;
    }
}