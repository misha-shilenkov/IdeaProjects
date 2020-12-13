package com.company;

import java.io.IOException;

public class helpJava3 {
    //---------------Справочная система JAVA------------
    public static void main(String[] args) throws IOException {
        char choise, ignore;
        for (; ;) {// for (; ;) обозначение бесконечного цикла for


            do {
                System.out.println("\nСправка");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do-while");
                System.out.println("6. break");
                System.out.println("7. continue\n");
                System.out.println("Выберите (q - выход): \n");

                choise = (char) System.in.read();

                // отбросить все остальные символы
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choise < '1' | choise > '7' & choise != 'q');
            // отбросить все остальные символы

            if (choise=='q') {break;}
            System.out.print("\n");


            switch (choise) {
                case '1':
                    System.out.println("Оператор if: ");
                    System.out.println("Cинтаксис: ");
                    System.out.println("if(условие) оператор;");
                    System.out.println("else оператор;\n");
                    break;
                case '2':
                    System.out.println("Оператор switch: ");
                    System.out.println("Cинтаксис: ");
                    System.out.println("switch(выражение) {");
                    System.out.println("case константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ...");
                    System.out.println(" }\n");
                    break;
                case '3':
                    System.out.println("Оператор for:");
                    System.out.println("Cинтаксис: ");
                    System.out.print("for(инициализация; условие; итерация)");
                    System.out.print(" оператор;\n");
                    break;

                case '4':
                    System.out.println("Оператор while:");
                    System.out.println("Cинтаксис: ");
                    System.out.print("while(условие) оператор;\n");
                    break;
                case '5':
                    System.out.println("Оператор do-while: ");
                    System.out.println("Cинтаксис: ");
                    System.out.println("do {");
                    System.out.println(" оператор;");
                    System.out.println(" } while (условие);\n");
                    break;
                case '6':
                    System.out.println("Оператор break: ");
                    System.out.println("Cинтаксис: ");
                    System.out.println("break; или break метка;\n");
                    break;
                case '7':
                    System.out.println("Оператор continue: ");
                    System.out.println("Cинтаксис: ");
                    System.out.println("continue; или continue метка;\n");
                    break;





            }

        }
    }
}
