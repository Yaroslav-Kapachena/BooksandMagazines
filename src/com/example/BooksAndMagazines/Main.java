package com.example.BooksAndMagazines;

import java.awt.font.ImageGraphicAttribute;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        

        ArrayList<Printable>  booksAndMagazine = new ArrayList<>();
        booksAndMagazine.add(1,book1);
        Books book1 = new Books();
        Magazines magazine1  = new Magazines();
        book1.print();
        magazine1.print();

    }
}
