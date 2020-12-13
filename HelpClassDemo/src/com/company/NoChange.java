package com.company;

public class NoChange {
    public static void main(String[] args) {
        int nums[]=new int[10];
        int i;
        for (i=0;i<10;i++){
            nums[i]=i+3;
            System.out.println("Сейчас "+i+"-ый элемент массива nums равен: "+(i+3));

            System.out.println();
            System.out.println("Далее будет показано чтоитерационная переменная в цикле for-each обеспечивает только чтение" +
                    " и не может использоваться для записи значения в элемент массива");
            System.out.println();
        }


        for (int x: nums){
            System.out.print(x+" ");
            x=x*10;

        }
        System.out.println();
        System.out.println("Тут значение элемента массива присваивается итерационной переменной умноженной на 10 (x=x*10 ), но ничего не происходит");
        System.out.println();

        for (int x: nums){
            System.out.print(x+" ");

        }
    }
}
