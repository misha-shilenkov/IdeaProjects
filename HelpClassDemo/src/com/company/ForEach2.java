package com.company;

public class ForEach2 {
    public static void main(String[] args) {
        int sum=0;
        int nums[][]=new int[3][5];
        // внести ряд значений в массив nums
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                nums[i][j]=(i+1)*(j+1);
            }
        }
        //Использовать разновидность for-each цикла for для суммирования и отображения значений
        //Обратить внимание на объявление переменной х
        for (int x[]:nums){
            System.out.println("начался for х");
            for (int y:x){
                System.out.println("начался for у");
                System.out.println("Значение: "+y);
                sum+=y;
            }
        }
        System.out.println("Сумма равна "+sum);
    }
}
