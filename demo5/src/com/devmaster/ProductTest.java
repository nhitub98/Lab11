package com.devmaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ProductTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<Integer, Product> productMap = new TreeMap<>();
            System.out.print("So luong san pham can nhap");
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin san pham thu" + (i + 1) + ":");
                System.out.print("id: ");
                String proId = scanner.nextLine();
                System.out.print("Ten san pham: ");
                String proName = scanner.nextLine();
                System.out.print("Nha san xuat: ");
                String producer = scanner.nextLine();
                System.out.print("Nam san xuat: ");
                int yearMaking = scanner.nextInt();
                System.out.print("Gia: ");
                float price = scanner.nextFloat();
                scanner.nextLine();
                Product product = new Product(proId, proName, producer, yearMaking, price);
                productMap.put(yearMaking, product);
            }
            System.out.println("Hien thi list san pham:");
            for (Product product : productMap.values()) {
                System.out.println(product);
            }

            // Hiển thị thông tin tăng dần theo năm sản xuất
            System.out.println("Sap xep san pham theo nam tang dan:");
            for (Product product : productMap.values()) {
                System.out.println(product);
            }

            scanner.close();
        }
    }