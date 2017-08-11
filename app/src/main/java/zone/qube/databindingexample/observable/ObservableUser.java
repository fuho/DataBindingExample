package zone.qube.databindingexample.observable;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.databinding.PropertyChangeRegistry;

import zone.qube.databindingexample.BR;

public class ObservableUser {

    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();

    public Book book = new Book();

    public ObservableUser(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }

    public Book getBook() {
        return book;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setBook(Book book) {
        this.book = book;
    }

    private static class WhatNeedsToBeExtended {
        //THIS IS SUPER IMPORTANT AND THEREFORE DOESN'T ALLOw US TO EXTEND BaseObservable
    }

    public static class Book extends WhatNeedsToBeExtended implements Observable {

        private PropertyChangeRegistry registry = new PropertyChangeRegistry();

        private String title;
        private Integer rating;

        public Book(String title, int rating) {
            this.title = title;
            this.rating = rating;
        }

        public Book() {
            //do nothing
        }

        @Bindable
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
            registry.notifyChange(this, BR.title);
        }

        @Bindable
        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
            registry.notifyChange(this, BR.rating);
        }

        @Override
        public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
            registry.add(callback);
        }

        @Override
        public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
            registry.remove(callback);
        }
    }

}
