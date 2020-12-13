package com.company;

//public class FinalizeJava {


    class FDemo{
        int x;

        // создаем метод FDemo с возвращаемой(передаваемой) переменной i типa int
        FDemo(int i){
            x=i; // переменной х присваивается значение передаваемой переменной i
        }
        //Вызывается при удалении объекта
        protected void finalize() {
            System.out.println("Финализация "+x);
        }
        //Генерирует объект который тотчас уничтожается
        void generator(int i){
            FDemo o=new FDemo(i);
        }
    }

    class Finalize {
        public static void main(String[] args) {
            int count;

            FDemo ob=new FDemo(0);
            /*Генерируется большое количество объектов
            В какой то момент времени должна начаться уборка мусора
            Примечание: возможно чтобыактивировать систему уборки мусора,
            количество генерируемых объектов придется увеличить
             */
            for (count=1;count<100000;count++);
            ob.generator(count);
        }
    }

 //   }



