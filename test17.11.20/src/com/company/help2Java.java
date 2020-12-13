package com.company;

import java.io.IOException;

public class help2Java {
    //---------------Справочная система JAVA------------
    public static void main(String[] args) throws IOException {
        char choise, ignore;
        do {
            System.out.println("Справка");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while\n");
            System.out.println("Выберите: ");

            choise = (char) System.in.read();

            // отбросить все остальные символы
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choise < '1' | choise > '5');
        // отбросить все остальные символы


        switch (choise) {
            case '1':
                System.out.println("Оператор if: \n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператор switch: \n");
                System.out.println("switch(выражение) {");
                System.out.println("case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println(" }");
                break;
            case '3':
                System.out.println("Оператор for:\n");
                System.out.print("for(инициализация; условие; итерация)");
                System.out.print(" оператор;");
                break;

            case '4':
                System.out.println("Оператор while:\n");
                System.out.print("while(условие) оператор;");
                break;
            case '5':
                System.out.println("Оператор do-while: \n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println(" } while (условие);");
                break;

/*
            default:
                System.out.println("Запрос не найден");

 */
        }
    }
}
