package com.company;
//----------Нахождение минимального и максимального значений в массиве
public class MinMax {
    public static void main(String[] args) {
        int nums[]=new int[10]; //объявляем массив "nums" с 10-тью элементами типа int

        int min, max;

        // объявляем элементы массива
        nums[0]=99;
        nums[1]=-10;
        nums[2]=100123;
        nums[3]=18;
        nums[4]=-978;
        nums[5]=5623;
        nums[6]=463;
        nums[7]=-9;
        nums[8]=287;
        nums[9]=48;
        // присваиваем переменным min, max значение первого элемента массива
        min=max=nums[0];
        // далее в цикле фор сравниваем значения элементов массива с переменными min и max
        // и переопределяем их если находится большее или меньшее значение
        for (int i=1;i<10;i++){

            if (nums[i]<min) {min=nums[i];} // если i-ый элемент массива меньше текущего значение min, тогда min присваивается это значение
            if (nums[i]>max) {max=nums[i];} // если i-ый элемент массива больше текущего значение max, тогда max присваивается это значение
        //таким образом, пройдя десять циклов переменные min и max принимают значения минимального и максимально элементов массива соответственно
        }
        //---------------инициализация массива в процессе его создания-----------------
        int bums[]={1,2,3,4,5,6};
        //---------------инициализация массива в процессе его создания-----------------
        System.out.println("минимальный элемент равен "+min);
        System.out.println("максимальный элемент равен "+max);
        //---------------вывод длины массива инициалированного в процессе его создания-----------------
        System.out.println("длина массива равна "+bums.length);
    }
}
