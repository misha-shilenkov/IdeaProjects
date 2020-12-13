package com.company;

public class breakGoto {
    public static void main(String[] args) {

      /*  int i;
        for (i = 0; i<4; i++) {
            zero:
            {
                one:
                {
                    two:
                    {
                        three:
                        {
                            System.out.println("\ni равно " + i);
                            if (i==0) break zero; //переход по метке
                            if (i == 1) break one;//переход по метке
                            if (i == 2) break two;//переход по метке
                            if (i == 3) break three;//переход по метке

                            //эта строка никогда не будет достигнута
                            System.out.println("Не будет выведено");
                        }
                        System.out.println("Программа выполняется После блока three");
                    }
                    System.out.println("Программа выполняется После блока two");
                }
                System.out.println("Программа выполняется После блока one");
            }
            System.out.println("Программа выполняется После блока zero, то есть повторяется цикл. i увеличивается на 1");

        }
        System.out.println("Программа выполняется После цикла for");*/
        done:
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                for (int k=0;k<2;k++){
                    System.out.println("k равно"+k+" ");
                    System.out.println("j равно"+j+" ");


                    if (j==5)  break done;// переход по метке done

                }
                System.out.println("После цикла по k");// не выполняется

            }
            System.out.println("После цикла по j");// не выполняется
        }
        System.out.println("выходим из внешнего цикла. Выполняется код после цикла по i");


    }
}
