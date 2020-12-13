package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here

    }

    void myMeth(){
        int i;
        for (i=0;i<10;i++){
            if (i==5) return;// Завершить цикл на значении 5
            System.out.println("e");
        }
    }
}