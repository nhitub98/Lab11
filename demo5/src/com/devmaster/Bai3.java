package com.devmaster;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so quoc gia:");
        int n = Integer.parseInt(scanner.nextLine());
        Map<Integer, String> nation = new HashMap<Integer, String>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap quoc gia thu " + (i + 1) + ":");
            String x = scanner.nextLine();
            nation.put(i, x);
        }
        System.out.println("Danh sach chua sap xep:");
        for (String x : nation.values()) {
            System.out.println(x);
        }
        List<Map.Entry<Integer, String>> lst = new ArrayList<>(nation.entrySet());
        lst.sort(Comparator.comparing(Map.Entry::getValue));
        System.out.println("Thu tu sau khi sap xep:");
        for (Map.Entry<Integer, String> entry : lst) {
            System.out.println(entry.getValue());
        }
    }
}