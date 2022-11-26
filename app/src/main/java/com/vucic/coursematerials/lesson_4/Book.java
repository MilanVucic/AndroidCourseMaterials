package com.vucic.coursematerials.lesson_4;

public class Book {
    private String title;
    private String author;
    private String description;
    private String datePublished;
    private int imageId;

    public Book(String title, String author, String description, String datePublished, int imageId) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.datePublished = datePublished;
        this.imageId = imageId;
    }
}
