package com.example.BooksAndMagazines;

public class Magazines implements Printable {
    private String nameOfMagazine;
    private String edition;

    public Magazines(){
    }
    public Magazines(String nameOfMagazine, String edition) {
        this.nameOfMagazine = nameOfMagazine;
        this.edition = edition;
    }

    public String getNameOfMagazine() {
        return nameOfMagazine;
    }

    public void setNameOfMagazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public void print()  {
        System.out.println("Журнал: "+getNameOfMagazine());
    }
}
