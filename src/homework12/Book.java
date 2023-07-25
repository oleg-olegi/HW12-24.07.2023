package homework12;

public class Book {
    private String bookName;
    private Author author;
    private int dateOfPublishing;

    public Book(String bookName, Author author, int dateOfPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.dateOfPublishing = dateOfPublishing;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDateOfPublishing() {
        return this.dateOfPublishing;
    }

    public void setDateOfPublishing(int year) {
        this.dateOfPublishing = year;
    }
}
