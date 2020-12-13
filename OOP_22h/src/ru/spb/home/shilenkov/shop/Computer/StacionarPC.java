package ru.spb.home.shilenkov.shop.Computer;

public class StacionarPC extends Computer {
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор    Alt+insert->Constructor


    public StacionarPC(String name, int HDVolume, String processorName) {
        super(name, HDVolume, processorName);
    }
}
