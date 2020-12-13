package com.company;//package com.company;
import java.util.Random;
import java.util.Scanner;

class main {

    public static void main(String[] args) {
	// write your code here
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int counter, guess, number;
        counter=0;
        guess=-1;
        number=random.nextInt(10);
        while (counter<3 && guess!=number) {
            System.out.println("GuessTheNumber 0...9:");
            guess=scanner.nextInt();

            if (guess!=number) {
                System.out.println("Твое число это"+(guess<number? "less": "круто"));
                counter++;
            }
        }




    }

}



