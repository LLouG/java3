package dayTwentyNine;

public class ObjectsAndReferences {
    public static void main(String[] args) {
        Books book = new Books("Three Kingdoms");
        book.setPages(251);

        BooksPages pages = new BooksPages(250);
        System.out.println(pages.minPages(book));
    }
}

class BooksPages {
    private int minPages;

    public BooksPages(int minPages) {
        this.minPages = minPages;
    }

    public boolean minPages(Books books) {
        if (books.getPages() < this.minPages) {
            return false;
        }
        return true;
    }
}

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