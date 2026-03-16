package test.project.p1.project;

public class Book {
    int id;
    String title;
    String author;
    int availableCopies;

    Book() {
        this.id = 0;
        this.title = "";
        this.author  = "";
        this.availableCopies = 0;
    }

    Book(int id, String title, String author, int availableCopies) {
        this.id = id;
        this.title = title;
        this.author  = author;
        this.availableCopies = availableCopies;
    }

    public void displayBookInfo() {
        System.out.println("Id: " + this.id);
        System.out.println("Title :" + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Available Copies :" + this.availableCopies);
    }
}
