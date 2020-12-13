package com.company;

class ChkNum {
    boolean isEven(int x) {
        if ((x%2)==0) return true;
        else return false;
    }
}
//-------------Создаем класс Factor и метод isFactor в нем
class Factor {
    boolean isFactor(int a, int b){
        if ((b%a)==0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        //---------------Передача аргумента(параметра) в метод isEven------------------
        ChkNum e = new ChkNum();
        if (e.isEven(10)) System.out.println("10 - четное число");
        if (e.isEven(9)) System.out.println("9 - не четное число");
        if (e.isEven(8)) System.out.println("8 - четное число");

        //-----------------------------Передача нескольких аркгуметов в метод isFactor--------------------
        Factor x=new Factor();// объявление объекта "х" типа "Factor"
        if (x.isFactor(2,20)) System.out.println("2 делитель");
        if (x.isFactor(3,20)) System.out.println("Эта строка не будет выполнена");

    }

}
