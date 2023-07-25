package homework12;

public class MainClass {
    public static void printAuthor(String name, String surName) {
        System.out.println("Имя - " + name + " \n" + "Фамилия - " + surName);
    }


    public static void main(String[] args) {
        Author turgenev = new Author("Ivan", "Turgenev");
        Author gogol = new Author("Nikolai", "Gogol");

        Book mumu = new Book("MuMu", turgenev, 1854);
        Book vii = new Book("Вий", gogol, 1010);

        System.out.println("turgenev.getName()+ \" \" + turgenev.getSurname() = " + turgenev.getName() + " " + turgenev.getSurname());
        System.out.println(mumu.getDateOfPublishing());
        System.out.println("vii.getBookName() = " + vii.getBookName());

        mumu.setDateOfPublishing(2025);
        System.out.println(mumu.getDateOfPublishing());

        System.out.println(mumu.getAuthor());

        turgenev.printAuthor(turgenev.getName(), turgenev.getSurname());
    }
}
