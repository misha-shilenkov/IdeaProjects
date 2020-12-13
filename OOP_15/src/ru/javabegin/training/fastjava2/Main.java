package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.objects.Phone;

public class Main {

    public static void main(String[] args) {
	// создадим объекты (из ранее созданного конструтора в классе Phone)
        Phone phone1=new Phone(1024, "Samsung","GSM");// создали объект phone1 класса Phone и передали(назначили) ему свойства
    //------------------------------------------------------------
        System.out.println();
        //быстрый вызов - набрать soutv
        System.out.println("phone.getType() - " + phone1.getType());
        System.out.println("phone.getName() - " + phone1.getName());
        System.out.println("phone.getRam() - " + phone1.getRam());


// создадим объекты (из ранее созданного конструтора в классе Phone)
        Phone phone2=new Phone(150, 5.5, "android"); // создали объект phone2 класса Phone и передали(назначили) ему свойства
        //быстрый вызов - набрать soutv
        System.out.println("phone2.getOS() = " + phone2.getOS());
        System.out.println("phone2.getPrice() = " + phone2.getPrice());
        System.out.println("phone2.getSize() = " + phone2.getSize());

    }
}
