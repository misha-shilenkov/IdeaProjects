package com.company;

public class StringArrays {
    public static void main(String[] args) {
        String strs[]={"Эта","строка","является","тестом."};
        System.out.println("исходный массив: ");
        // разновидность цикла for цикл for-each
        //его синтаксис: for(тип итер_пер : коллекция) блок_операторов
        for (String s: strs){ // s - это итерационная переменная в которой сохраняются поочередно перебераемые элементы набора данных
            System.out.print(s+" ");// " " добавляет пробел между каждым элементом массива(между словами)
        }
        System.out.println("\n");
        // изменить строку
        strs[2]="так же является"; // меняем второй элемент массива на "так же является"
        strs[3]="тестом!"; // меняем третий элемент массива на "тестом!"

        System.out.println("Измененный массив: ");
        for (String s: strs){
            System.out.print(s+" ");
        }
        System.out.println(strs[1]);
    }
}
