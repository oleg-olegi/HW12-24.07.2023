package homework12;

public class Book {
    private String title;
    private Author author;
    private int dateOfPublishing;


    public Book(String title, Author author, int dateOfPublishing) {
        this.title = title;
        this.author = author;
        this.dateOfPublishing = dateOfPublishing;

    }

    public String getTitle() {
        return this.title;
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
