package com.company;

import java.io.IOException;

public class inputSymbol2 {
    public static void main(String[] args) throws IOException {
      /* ---------------ВРЕМЕННО ЗАКОММЕНТИЛ---------------------
       char ch;
        int col = 0, col2 = 0;
        boolean running = true;

        System.out.println("Напиши предложение и нажмите ENTER: ");
        for (; ; ) {
            ch = (char) System.in.read();// получить символ с клавиатуры

            if (ch == '.') break;
            if (ch == ' ') col++;
        }
        System.out.println("YOU WIN");
        System.out.println("количество нажатых пробелов равно: " + col);
        //----------------------------------//--------------------------------------//
        int i, x = 1, y = 2;
        for (i = 0; i < 10; i++) {
            while (running) {
                if (x < y) break;
            }
            System.out.println("Posle wile");
        }
        System.out.println("Posle for");

        //----------------------------------//--------------------------------------//
        for (i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if ((i % 2) == 0) continue;
            System.out.println();
        }
        //----------------------------------//--------------------------------------//
        for (i = 1; i <= 264; i*=2) {
            System.out.print(i + " ");

        }
        ---------------ВРЕМЕННО ЗАКОММЕНТИЛ---------------------*/
        char ch,chNewDown, ignore;
        int chet=0;
        ch=65;// соответствует символу "A"
        System.out.println(ch);

        ch=90; //соответствует символу "Z"
        System.out.println(ch);

        ch=97;//соответствует символу "a"
        System.out.println(ch);

        ch=122;//соответствует символу "z"
        System.out.println(ch);



        System.out.println("Напиши предложение и нажмите ENTER: ");
        for (;;) {
           ch = (char) System.in.read();// получить символ с клавиатуры

            if (ch>=97&&ch<=122){
                chNewDown=ch;
                chNewDown-=32;
                System.out.println("введенный символ "+ch+" преобразован в "+chNewDown);

                do { // отбросить все остальные символы
                    ignore = (char) System.in.read();
                    /*  System.out.println("отброшен символ "+ignore);*/
                }
                while (ignore != '\n');

                if (ch == '.')
                { System.out.println("счетчик символов насчитал: "+chet);
                    break;
                }
                chet++;
            }

            else if (ch>=65&&ch<=90) {
                chNewDown=ch;
                chNewDown+=32;
                System.out.println("введенный символ "+ch+" преобразован в "+chNewDown);

                do { // отбросить все остальные символы
                    ignore = (char) System.in.read();
                    /*  System.out.println("отброшен символ "+ignore);*/
                }
                while (ignore != '\n');

                if (ch == '.')
                { System.out.println("счетчик символов насчитал: "+chet);
                    break;
                }
                chet++;
            }
            else {chNewDown=ch;

                System.out.println("введенный символ "+ch+" преобразован в "+chNewDown);

                do { // отбросить все остальные символы
                    ignore = (char) System.in.read();
                    /*  System.out.println("отброшен символ "+ignore);*/
                }
                while (ignore != '\n');

                if (ch == '.')
                { System.out.println("счетчик символов насчитал: "+chet);
                    break;
                }
            }



        }

    }
}