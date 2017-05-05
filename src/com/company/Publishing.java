package com.company;

/**
 * Created by serik on 5/5/17.
 */

public class Publishing {
    private int id;
    private int pages;
    private int year;
    private int month;
    private String type;
    private String name;
    private String publisher;

    public Publishing() {
    }

    public Publishing (int id, String type, String name, String publisher, int year, int month, int pages){
        this.setId(id);
        this.setType(type);
        this.setName(name);
        this.setPublisher(publisher);
        this.setYear(year);
        this.setMonth(month);
        this.setPages(pages);
    }

    public Publishing(Publishing obj){
        this.setId(obj.id);
        this.setType(obj.type);
        this.setName(obj.name);
        this.setPublisher(obj.publisher);
        this.setYear(obj.year);
        this.setMonth(obj.month);
        this.setPages(obj.pages);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Boolean equals(Publishing obj){
        if (this.getId() == obj.getId()){
            return true;
        }
        return false;
    }


    public String toString(){
        return "ID: " + getId() + "\nTYPE: " + getType() + "\nNAME: " + getName() + "\nPUBLISHER: " + getPublisher() +
                "\nPAGES: " + getPages() + "\nYEAR: " + getYear() + "\nMONTH: " + getMonth() +"\n";
    }
    public String toString2(){
        return "ID: " + getId() + "\tTYPE: " + getType() + "\tNAME: " + getName() + "\tPUBLISHER: " + getPublisher() +
                "\nPAGES: " + getPages() + "\tYEAR: " + getYear() + "\tMONTH: " + getMonth() +"\n";
    }

}
