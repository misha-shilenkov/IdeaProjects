package ru.spb.home.shilenkov.shop.objects;

public class Toyota {
    // Задаем свойства родительского класса
    private String name;
    private double volume;

    // создаем конструктор c двумя переменными(name и volume)    Alt+insert->Constructor

    public Toyota(String name, double volume) {
        this.name = name;
        this.volume = volume;
        System.out.println("Был вызван Toyota конструктор");
    }

    // создаем конструктор c одной переменной(name)    Alt+insert->Constructor

    public Toyota(String name) {
        this.name = name;
    }


    // создаем конструктор c одной переменной(volume)    Alt+insert->Constructor


    public Toyota(double volume) {
        this.volume = volume;
    }

    // создаем геттеры и сеттеры при помощи Refactor->Encapsulated fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
