package com.company;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Author> authors = new ArrayList<Author>();
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title){
        this.title=title;
    }
    public String print(){
        String s="";
        s=s+this.title;
        String a="";
        for(Author i : authors){
            a=a+i.printAuthor();
        }
        s=s+a;
        return s;
    }
    public void addAuthor(Author author1){
        authors.add(author1);
    }
    public int createChapter(String cap){
        Chapter c=new Chapter(cap);
        chapters.add(c);
        return chapters.indexOf(c);
    }
    public Chapter getChapter(int indexChapter){
        return (Chapter)chapters.get(indexChapter);
    }

}
