package com.company;

/**
 * Created by serik on 5/5/17.
 */
public class Book extends Publishing{
    private String shortContent;
    private String genre;
    private String author;
    public Book(){}
    public Book(Publishing pub, String author, String genre, String shortContent){
        super(pub);
        this.setShortContent(shortContent);
        this.setGenre(genre);
        this.setAuthor(author);
    }
    public Book(int id, String type, String name, String publisher, int year, int month, int pages, String author, String genre, String shortContent) {
        super(id, type, name, publisher, year, month, pages);
        this.setShortContent(shortContent);
        this.setGenre(genre);
        this.setAuthor(author);
    }
    @Override
    public String toString(){
        return super.toString() + "GENRE: " + getGenre() + "\tAUTHOR: " + getAuthor() + "\nABSTRACT: " + getShortContent() + "\n------------------------------------------------------\n";
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean equals(Object o){
        if (o instanceof Book){
            Book toCompare = (Book) o;
            if (this.getAuthor().toLowerCase().equals(toCompare.getAuthor().toLowerCase()) && this.getName().toLowerCase().equals(toCompare.getName().toLowerCase()) && this.getYear() == toCompare.getYear()){
                return true;
            }
        }
        return false;
    }
}
