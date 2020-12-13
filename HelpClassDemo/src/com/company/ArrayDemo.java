package com.company;
//--------------Глава5.
//-------------Одномерные массивы
public class ArrayDemo {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        // объявление массива
        int sample[]=new int[10];//синтаксис следующий: тип имя_массива[]=new тип [размер];
        /*
        объявление массива можно разделить на две составляющие:
        int sample[];
        sample = new int[10];
        */

        for (i=0;i<10;i++){
            sample[i]=i;
        }
        /* развернутая запись приаедена ниже
        сначала i тому элементу массива присваивается значение i
       for (i=0;i<10;i++){
           sample[i]=i;
       }
Затем вывод в консоль i и i-ых элементы массива
        for (i=0;i<10;i++){
            System.out.println("Элемент ["+i+"]: "+sample[i]);
        }*/



    }

}
