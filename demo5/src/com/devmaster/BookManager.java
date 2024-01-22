package com.devmaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    List<Book> book = new ArrayList<>();
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private float price;

    public BookManager() {
    }

    public void nhapDuLieu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap so sach can nhap:");
        int cnt = Integer.parseInt(reader.readLine());
        for (int i = 0; i < cnt; ++i) {
            System.out.println("Nhap cuon thu " + (i + 1));
            Book book = new Book();
            System.out.print("ISBN: ");
            book.setIsbn(reader.readLine());

            System.out.print("Ten sach: ");
            book.setBookName(reader.readLine());

            System.out.print("Tac gia: ");
            book.setAuthor(reader.readLine());

            System.out.print("Nha xuat ban: ");
            book.setPublisher(reader.readLine());

            System.out.print("Gia sach: ");
            float price = Float.parseFloat(reader.readLine());
            book.setPrice(price);

            this.book.add(book);
        }
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
    public void hienThiDanhSach() {
        System.out.println("So sach vua nhap: ");

        for (int i = 0; i < this.book.size(); ++i) {
            Book get = (Book) this.book.get(i);
            System.err.println(i + 1 + ". " + get.toString());
        }
        System.out.println("So sach sau khi sap xep theo gia giam dan");
        Collections.sort(book, (b1, b2) -> Float.compare(b2.getPrice(), b1.getPrice()));
        for (Book book : book) {
            System.out.println(book);
        }
    }
    public static void main(String[] args) throws IOException {
        BookManager bookManager = new BookManager();
        bookManager.nhapDuLieu();
        bookManager.hienThiDanhSach();
    }
}
