package com.company;
//-----------Оператор continue---------------
/* Оператор continue осуществляет принудительный переход к следующему шагу цикла, пропуская оставшитйся невыполненный код
С помощью оператора continue осуществляется досрочное завершение шага итерации цикла в обход обычной структуры управлоения циклом
* */
public class ContDemo {
    public static void main(String[] args) {
        int i;
        //вывести числа от 1 до 100 только четные
        for (i=0;i<=100;i++) {
            if ((i%2)!=0) continue; //когда остаток от деления i на 2 не равен нулю срабатывает
            // оператор continue и осуществляется принудительтный переход к следующему шагу цикла
            //вывод в консоль не четного числа не производится так как шаг итерации цикла завершается досрочно
            //в обход вызова метода println(этот участок ода пропускается)
            System.out.println(i);
            System.out.println("----------------------------------------");
            System.out.println();
        }

        outerloop:
        for (int j=1;j<10;j++){
            System.out.println("Внешний цикл проход "+j+". внутренний цикл проход: ");
            for (int k = 0; k<10; k++){
                if (k==5)continue outerloop;//продолжить внешний цикл при достижении к=5
                System.out.print(k+"\n");
            }
        }

    }
}