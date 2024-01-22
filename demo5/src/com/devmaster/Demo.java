package com.devmaster;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        // HashSet-> Sắp xếp danh sách
        // LinkedHashSet -> Không sắp xếp
//        Set<String> stringSet = new HashSet<>(); //tự sắp xếp danh sách
//        stringSet.add("2");
//        stringSet.add("1");
//        stringSet.add("1");
//        stringSet.add("3");
//        for (String s : stringSet) {
//            System.out.println(s);
//        }
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("2", "Hoa"); //nhap key và value
        stringMap.put("3", "Tung");
        stringMap.put("1", "Dong");
        stringMap.put("4", "Tue");
        stringMap.put("5", "Trang");
        System.out.println(stringMap.get("1")); //get theo key
        stringMap.forEach((key, value) -> { //phim tat ctrl+ space
            System.out.printf("[%s,%s]\n", key, value);
        });
    }
}

