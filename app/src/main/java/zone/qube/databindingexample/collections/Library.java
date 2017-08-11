package zone.qube.databindingexample.collections;

import java.util.ArrayList;

public class Library {
    public final ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        this.books.add(new Book(title, author));
    }

    public static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}
