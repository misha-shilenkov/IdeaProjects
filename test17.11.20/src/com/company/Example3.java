package com.company;

class Example3 {
    public static void main (String args[]) {
        int var=10, count=0;
        double x=10.00;
        double gallons=10;
        double liters=gallons*3.7854;



        System.out.println("Начальное значение переменной var: "+var);
        System.out.println("Начальное значение переменной x: "+x);
        System.out.println();

        var=var/4;
        x=x/4;
        System.out.println("Значение переменной var после деления на 4 равно: "+var);
        System.out.println("Значение переменной x после деления на 4 равно: "+x);

        for (gallons=1; gallons<=100; gallons++)
        {
            liters=gallons*3.7854;
            System.out.println(gallons+"-ти галлонам соответствует "+liters+" литров");
            count++;
            if (count==10) {
                System.out.println("----------------------------------------------");
                count=0;
            }
        }
        System.out.println("The end");
    }
}
