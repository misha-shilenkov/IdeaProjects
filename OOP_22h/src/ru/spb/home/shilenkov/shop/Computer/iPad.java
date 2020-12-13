package ru.spb.home.shilenkov.shop.Computer;

public class iPad extends Computer{
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор    Alt+insert->Constructor

    public iPad(String name, int HDVolume, String processorName) {
        super(name, HDVolume, processorName);
    }
}
