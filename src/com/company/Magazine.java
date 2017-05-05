package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by serik on 5/5/17.
 */
public class Magazine extends Publishing{
    private List<String> articles;
    public Magazine(){
    }
    public Magazine(int id, String type, String name, String publisher, int year, int month, int pages, List<String> articles) {
        super(id, type, name, publisher, year, month, pages);
        this.setArticles(articles);
    }
    public Magazine(Publishing pub,  List<String> articles){
        super(pub);
        this.setArticles(articles);
    }
    @Override
    public String toString(){
        String result = "";
        List<String> list = getArticles();
        for (int i = 0; i < list.size(); i++){
            result = result + i + " .\t" + list.get(i) + "\n";
        }
        return super.toString() + "ARTICLES: \n" + result + "\n------------------------------------------------------\n";
    }

    public List<String> getArticles() {
        return articles;
    }

    public void setArticles(List<String> articles) {
        this.articles = articles;
    }


    public boolean equals(Object o){
        if (o instanceof Magazine){
            Magazine toCompare = (Magazine) o;
            if (this.getName().toLowerCase().equals(toCompare.getName().toLowerCase()) && this.getYear() == toCompare.getYear() && this.getMonth() == toCompare.getMonth()){
                return true;
            }
        }
        return false;
    }


}
