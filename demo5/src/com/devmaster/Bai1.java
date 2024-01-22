package com.devmaster;

import java.sql.SQLOutput;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so n:");
        int n=Integer.parseInt(scanner.nextLine());
        List<Integer> lstSoNguyen = new ArrayList<Integer>(); //collection dang List
        for(int i=0;i<n;i++){
            System.out.println("Nhap so thu i:"+i);
            int x=Integer.parseInt(scanner.nextLine());
            lstSoNguyen.add(x);
        }
        for (Integer item : lstSoNguyen) {
            System.out.println(item);
        }
        Collections.sort(lstSoNguyen);
        System.out.println("Danh sach sau khi sap xep " + lstSoNguyen);
    }
    }

