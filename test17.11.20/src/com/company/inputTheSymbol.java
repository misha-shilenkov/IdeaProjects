package com.company;


//--------------------Чтение символов с клавиатуры---------------


import java.io.IOException;

public class inputTheSymbol {

    public static void main(String args[]) throws IOException {

        char ch, answer = 'd', ignore;


        do {
            System.out.println("Нажмите любую клавишу, а затем наж=мите ENTER: ");
            ch = (char) System.in.read();// получить символ с клавиатуры
            // отбросить все остальные символы
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("YOU WIN");

            } else {

                System.out.println("Вы нажали клавишу: " + ch + ". ");
                System.out.print("Нужная буква находится ");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        }
        while (answer != ch);
    }
}


