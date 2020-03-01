package pl.sda.student;

public class Book {
    private String name;
    private Author author;
    private Category category;

    public Book(String name, Author author, Category category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }
}