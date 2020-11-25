package com.company;

public class BooksTestDrive {
    public static void main (String [] args){
        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "The Grapes";
        myBooks[1].title = "The Java Gat";
        myBooks[2].title = "The CookBook";
        myBooks[0].author = "bob";
        myBooks[1].author = "peter";
        myBooks[2].author = "ian";

        int x = 0;
        while (x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(" by");
            System.out.println(myBooks[x].author) ;
            x = x +1 ;

        }



    }
}
