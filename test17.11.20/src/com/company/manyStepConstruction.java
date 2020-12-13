package com.company;

public class manyStepConstruction {

    public static void main(String[] args) {
        //----------Многоступенчатая конструкция if-else-if-------------------
     int x;
     for (x=0;x<6;x++){
         if (x==1) System.out.println("x равно единице");
         else if (x==2) System.out.println("x равно двум");
         else if (x==3) System.out.println("x равно трем");
         else if (x==4) System.out.println("x равно четырем");
         else System.out.println("Значение x находится вне диапазона 1-4");
     }

     //-----------------Оператор SWITCH----------------------
        int i;
     for (i=0;i<10;i++)
         switch (i) {
             case 0:
                 System.out.println("i равно нулю");
                 break;
             case 1:
                 System.out.println("i равно единице");
                 break;
             case 2:
                 System.out.println("i равно двум");
                 break;
             case 3:
                 System.out.println("i равно трем");
                 break;
             case 4:
                 System.out.println("i равно четырем");
                 break;
             default:
                 System.out.println("i больше или равно пяти");
         }
    }
}
