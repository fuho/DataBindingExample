package zone.qube.databindingexample.collections;

import android.databinding.ObservableArrayList;

public class Library {
    public final ObservableArrayList<Book> books = new ObservableArrayList<>();

    public void addBook(String title, String author) {
        final int index = this.books.size();
        this.books.add(new Book(index, title, author));
    }

    public void removeBook(int index) {
        this.books.remove(index);
    }

    public static class Book {
        private final int index;
        private final String title;
        private final String author;

        public Book(int index, String title, String author) {
            this.index = index;
            this.title = title;
            this.author = author;
        }

        public int getIndex() {
            return index;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}
