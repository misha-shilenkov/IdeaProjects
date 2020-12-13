package com.company;

public class findFac {
    public static void main(String[] args) {
        int count=0;
        for (int i=2;i<=100;i++){

            System.out.print("Делители для "+i+" будут: ");
            for (int j=1;j<=(i/2);j++)
            {count++;
                if (((i%j)==0)&j!=1) {System.out.print(j+" ");}
            }
               System.out.println();
        }
       System.out.println("Количество итераций внутреннего цикла равно "+count);
    }
}
