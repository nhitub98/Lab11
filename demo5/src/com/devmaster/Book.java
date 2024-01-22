package com.devmaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Book {
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private float price;

    public Book(String isbn, String bookName, String author, String publisher, float price) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

//    public void nhapDuLieu() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("ISBN: ");
//        this.isbn = reader.readLine();
//        System.out.print("Ten sach: ");
//        this.bookName = reader.readLine();
//
//        System.out.print("Tac gia: ");
//        this.author = reader.readLine();
//
//        System.out.print("Nha xuat ban: ");
//        this.publisher = reader.readLine();
//
//        System.out.print("Gia sach: ");
//        this.price = Float.parseFloat(reader.readLine());
//    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
