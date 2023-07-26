package homework12;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void printAuthor(String name, String surname) {
        System.out.println(this.name + " " + this.surname);
    }
}
