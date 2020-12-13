package com.company;
//----------------Создание не циклической очереди------------------
/*Класс, реализующий очередь хранения символов*/
class Queue {
    int q[]; //массив для хранения элементов очереди
    char z[]; //массив для хранения элементов очереди
    int putloc,getloc;// индексы для вставки и извлечения элементов очереди

    // Конструктор класса Queue создает очередь заданного размера
    Queue(int size) {
        q=new int[size+1];// выделить память для очереди
        z=new char[size+1];// выделить память для очереди
        putloc=getloc=0;
    }

    // Метод put() помещающий элемент в очередь имеет следующий вид

    void put(int ch){
        if (putloc==q.length-1) {
            System.out.println("-Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc]=ch;

    }

    void put2(char ch2){
        if (putloc==z.length-1) {
            System.out.println("-Очередь заполнена");
            return;
        }
        putloc++;
        z[putloc]=ch2;
    }
    // Для извлечения элементов из очереди служит метод get() код которого приведен ниже
    int get() {
        if (getloc==putloc) {
            System.out.println(" - Очередь пуста");
            return (int) 0;
        }
        getloc++;
        return q[getloc];
    }

    char get2() {
        if (getloc==putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return z[getloc];
    }

}



public class QDemo {
    public static void main(String[] args) {
        Queue bigQ=new Queue(100);
        Queue smallQ=new Queue(4);
        int ch;
        int i;
        char ch2;
        System.out.println("Использование очереди bigQ для сохранеия алфавита");

        // Поместить буквенные символы в очередь bigQ
        for (i=0;i<26;i++) {
            bigQ.put((int)(1+i));
        }

        for (i=0;i<26;i++) {
            bigQ.put2((char)('A'+i));
        }

        // Извлечь буквенные символы из очереди bigQ и отобразить
        for (i=0;i<26;i++){
            ch= bigQ.get();
            ch2= bigQ.get2();
            if (ch!=(int)0) {
                System.out.print(ch+" ");
                System.out.print(ch2+" ");
            }
        }
        System.out.println("\n");
        System.out.println("Использование очереди smallQ для генерации ошибок");
        /*"Использование очереди smallQ для генерации ошибок"*/
        for (i=0;i<5;i++){
            System.out.print("попытка сохранения "+ (int) (5-i));
            smallQ.put((int)(5-i));
            System.out.println();
        }
        System.out.println();

        for (i=0;i<5;i++){
            System.out.print("попытка сохранения "+ (char) ('Z'-i));
            smallQ.put2((char)('Z'-i));
            System.out.println();
        }
        System.out.println();
        //Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for (i=0;i<5;i++){
            ch=smallQ.get();

            if (ch!=(int) 0) {
                System.out.print(ch+" ");
                            }
        }

        for (i=0;i<5;i++){

            ch2=smallQ.get2();

            if (ch2!=(char) 0) {
                System.out.print(ch2+" ");
            }
        }
    }

}

