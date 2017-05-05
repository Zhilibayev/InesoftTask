package com.company;

/**
 * Created by serik on 5/5/17.
 */
public class Booklet extends Publishing{

    private String shortContent;
    public Booklet(){}
    public Booklet(Publishing pub, String shortContent){
        super(pub);
        this.setShortContent(shortContent);
    }
    public Booklet(int id, String type, String name, String publisher, int year, int month, int pages,  String shortContent) {
        super(id, type, name, publisher, year, month, pages);
        this.setShortContent(shortContent);
    }
    @Override
    public String toString(){
        return super.toString() + "ABSTRACT: " + getShortContent() + "\n------------------------------------------------------\n";
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String articles) {
        this.shortContent = articles;
    }

    public boolean equals(Object o){
        if (o instanceof Booklet){
            Booklet toCompare = (Booklet) o;
            if (this.getName().toLowerCase().equals(toCompare.getName().toLowerCase()) && this.getMonth() == toCompare.getMonth() && this.getYear() == toCompare.getYear()){
                return true;
            }
        }
        return false;
    }
}
