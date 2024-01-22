package com.devmaster;

public class ChuanHoaTen {

    public static void main(String[] args) {
        String str = "  nguYEn duY tUng  ";
        str = str.trim().toUpperCase();
        String[] words = str.split("\\s+"); //tach chuoi thanh cac tu
        StringBuilder chuoiChuanHoa = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                chuoiChuanHoa.append(firstChar).append(restOfWord).append(" ");
            }
        }
        String result = chuoiChuanHoa.toString().trim();
        System.out.println("Chuoi da chuan hoa: " + result);
    }
}