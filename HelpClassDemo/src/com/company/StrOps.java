package com.company;

public class StrOps {
    public static void main(String[] args) {
        String str1="Java - лидер Интернета!!!!";
        String str2=new String(str1);
       // String str3=new String(str1);
        String str3="Строки JAVA эффективны";
        String str4="Java - лидер Интернета!!!";
        int result, idx;
        char ch;

        System.out.println("Длина str1: "+str1.length());
        System.out.println("Длина str2: "+str2.length());
        System.out.println("Длина str3: "+str3.length());
        System.out.println("Длина str4: "+str4.length());


        System.out.println();

        if (str1.equals(str2)){
            System.out.println("str1 эквивалентна str2");
        }
        else {
            System.out.println("str1 не эквивалентна str2");
        }

        if (str1.equals(str3)){
            System.out.println("str1 эквивалентна str3");
        }
        else {
            System.out.println("str1 не эквивалентна str3");
        }
        result=str1.compareTo(str4);
        System.out.println("result возвратил: "+result);
        System.out.println();


        if (result<0)
            System.out.println("str1 меньше str4 по количеству символов на " +(str4.length()-str1.length())+"штуки");

        else if (result>0)  //if

            System.out.println("str1 больше str4 по количеству символов на "+(str1.length()-str4.length())+" штуки" );




        else // (result==0)

            System.out.println("str1 и str3 равны по количеству символов");



        // Присвоить переменной str2 новую строку
        str2="One Two Three One";

        idx=str2.indexOf("One");
        System.out.println("Индекс первого вхождения One: "+idx);

        idx=str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One: "+idx);

       System.out.println();
        // Отобразить строку посимвольно
        for (int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }
    }
}
