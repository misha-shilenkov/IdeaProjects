package ru.javabegin.training.fastjava2.objects;

public class Phone {
    //задаем свойства класса
    private int ram;
    private String name;
    private String type;
    //--------------------
    private double price;
    private double size;
    private String OS;



//пустой конструктор
    public Phone(/*параметры конструктора*/) {
        /*тело конструктора*/
    }
// создаем конструктор для первой группы переменных(свойств класса)
// правой кнопкой -> Generate->constructor->выбрать параметры и создастся этот конструктор
    public Phone(int ram, String name, String type) {
        this.ram = ram;
        this.name = name;
        this.type = type;
    }

    // создаем конструктор для второй группы переменных(свойств класса)
// правой кнопкой -> Generate-> (или Alt+insert) -> constructor->выбрать параметры и создастся этот конструктор


    public Phone(double price, double size, String OS) {
        this.setPrice(price);
        this.setSize(size);
        this.setOS(OS);
    }

    // создаем геттеры и сеттеры для первой группы переменных(свойств класса) через меню Refactor->Encapsulated Fields
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // создаем геттеры и сеттеры для второй группы переменных(свойств класса) через меню Refactor->Encapsulated Fields

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

}
