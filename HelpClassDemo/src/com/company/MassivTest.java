package com.company;

import org.cef.CefApp;

public class MassivTest {
    public static void main(String[] args) {

        int razmernost = 6;
        int massiv[] = new int[razmernost];
        int nums[]= {1,2,3,4,5,6,7,8,9,10};
        int i, sum = 0;

        System.out.println("вычисляем квадраты чесел от 1 до "+razmernost+":");
        for (i = 1; i < razmernost; i++) {
            massiv[i] = i * i;

            System.out.println(i + " в квадрате равен " + massiv[i]);
        }
        // Особая форма разновидности цикла for. Называется for-each. При такой форме записи массив автоматически
        // обрабатывается от начала и до конца.
        //Нет необходимости в использовании  переменной цикла
        // задании исходного значения переменной цикла, условия завершения цикла и индексирования массива

        System.out.println();
        System.out.println("Вычисляем сумму элементов массива с элементами от 1 до 10: ");
        for (int x: nums) {
            sum +=x;
            System.out.println("Сумма первых "+x+"-х элементов массива равна "+sum);
        }
        System.out.println();
        System.out.println("ИТОГО, сумма всех элементов массива равна "+ sum);

        //на каждом шаге этого цикла переменная х автоматически принимает значение равное очередному элементу массива nums
        // Чтобы преждевременно завершить такой цикл нужно воспользоваться оператором break


    }

}
