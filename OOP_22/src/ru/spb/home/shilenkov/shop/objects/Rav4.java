package ru.spb.home.shilenkov.shop.objects;

public class Rav4 extends Toyota {
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор c одной переменной(name)    Alt+insert->Constructor


    public Rav4(String name, double volume) {
        super(name, volume); //этот конструктор отсылается к родительскому классу Toyota в конструктор c двумя переменными(name и volume)
        System.out.println("Был вызван Rav4 конструктор");
    }
}
