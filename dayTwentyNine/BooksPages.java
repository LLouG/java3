package dayTwentyNine;

public class BooksPages {
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