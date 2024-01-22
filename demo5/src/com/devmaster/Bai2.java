package com.devmaster;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n thanh pho:");
        int n = Integer.parseInt(scanner.nextLine()); //convert tu string sang integer
        Set<String> words = new HashSet<String>(); //tự sắp xếp danh sách
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thanh pho thu:" + i);
           String x = scanner.nextLine();
            words.add(x);
        }
        for (String item : words) {
            System.out.println(item);
        }


    }
}
