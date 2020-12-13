package ru.spb.home.shilenkov.shop.objects;

public class Camry extends Toyota {
// нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем три конструктора (или минимум один обязательно) c двумя переменной(name, volume),    Alt+insert->Constructor
    //  c одной переменной(name),    Alt+insert->Constructor
    //  c одной переменной(volume)    Alt+insert->Constructor

    public Camry(String name, double volume) {
        super(name, volume);//этот конструктор отсылается к родительскому классу Toyota в конструктор c двумя переменными(name и volume)
    }

    public Camry(String name) {
        super(name);//этот конструктор отсылается к родительскому классу Toyota по ключевому слову super
    }

    public Camry(double volume) {
        super(volume);//этот конструктор отсылается к родительскому классу Toyota  по ключевому слову super
    }
}
