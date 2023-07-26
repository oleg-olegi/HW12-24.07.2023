package homework12;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
    public String getAuthor() { //
        return this.name +" "+ this.surname;
    }
    public void printAuthor( ) { //метод для вывода автора

        System.out.println(this.name + " " + this.surname);
    }
}
