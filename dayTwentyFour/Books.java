package dayTwentyFour;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        ListBooks myBooks = new ListBooks();
        myBooks.listBooks();
    }
}

class ListBooks {
    Scanner scanner = new Scanner(System.in);
    ArrayList<GetBooks> getBooks = new ArrayList<>();

    public void listBooks() {
        while (true) {
            System.out.println("");
            System.out.println(
                    "Provide the book name, author and year of release, leave empty to end the program.\nE.g.: The Hitchhiker's Guide to the Galaxy,Douglas Adams,1979");
            String getInput = scanner.nextLine();

            if (getInput.equals("")) {
                break;
            }

            String[] splitInput = getInput.split(",");
            String book = splitInput[0];
            String author = splitInput[1];
            int releaseYear = Integer.valueOf(splitInput[2]);
            getBooks.add(new GetBooks(book, author, releaseYear));
        }

        for (GetBooks lBooks : getBooks) {
            System.out.println(lBooks);
        }
    }
}

class GetBooks {
    private String book;
    private String author;
    private int releaseYear;

    public GetBooks(String book, String author, int releaseYear) {
        this.book = book;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getBook() {
        return book;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String toString() {
        return "Book name: " + this.book +
                "\nWriten by: " + this.author +
                "\nYear of release: " + this.releaseYear + "\n";
    }
}