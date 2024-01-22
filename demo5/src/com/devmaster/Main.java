package com.devmaster;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>(); //thêm đối tượng kể cả trùng lặp
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("1");
        list.add("2");
//        List<String> list1=new ArrayList<>(); //them mang list1
//        list1.add("2");
//        list.addAll(list1);
//        for(String s: list){
//            System.out.println(s);
//        }
//        System.out.println("Sau khi set");
//        list.set(1,"4");
//        for(String s: list){
//            System.out.println(s);
//        }
//        System.out.println("Xoa phan tu thu 3");
//        list.remove(3);
//        for(String s:list){
//            System.out.println(s);
//        }
        System.out.println("Index of cua 1: "+ list.indexOf("1"));
        System.out.println("Last index of cua 1: "+list.lastIndexOf("1"));
    }
}
