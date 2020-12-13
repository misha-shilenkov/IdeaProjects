package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        int i;
        System.out.println("if you want to stop, press 'S' ");
        for (i=0;(char)System.in.read()!='S'; i++)
            System.out.println("Проход №"+i);

     /*   int var1=1024;
        int var2=var1/2;
        System.out.println("Переменная var1 равна: "+var1+", переменная var2 равна"+var2);*/
	// write your code here


    }
}
