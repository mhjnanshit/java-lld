package LibraryManagement;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean availability;

    public Book(String bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availability = true;
    }

    @Override
    public String toString(){
        return "BookID: " + this.bookId + " Title: " + this.title + " Author: " + this.author;
    }

    public String getBookId(){
        return this.bookId;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public boolean checkAvailability(){
        return this.availability;
    }

    public void markBorrowed(){
        this.availability = false;
    }

    public void markReturned(){
        this.availability = true;
    }

}
