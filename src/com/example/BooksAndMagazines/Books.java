package com.example.BooksAndMagazines;

public class Books implements Printable {
    private String nameOfBook;
    private String writer;

    public Books() {
    }

    public Books(String nameOfBook, String writer) {
        this.nameOfBook = nameOfBook;
        this.writer = writer;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + getNameOfBook());
    }


}