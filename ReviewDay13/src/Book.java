/**
 * Created by aabah on 10/15/2016.
 */

import java.util.*;
public abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}
//Write MyBook Class
class MyBook extends Book{
    //private String title;
    // private String author;
    private int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    void display(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ price);
    }
}