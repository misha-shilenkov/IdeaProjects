package com.company;

public class StringDemo {
    public static void main(String[] args) {
        //различные способы объявления строк
        String str1=new String("В JAVA строки объектны");
        String str2="Их можно объявлять разными способами";
        String str3=new String(str2);
        String str4=str2;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
