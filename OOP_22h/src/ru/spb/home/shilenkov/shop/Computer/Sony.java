package ru.spb.home.shilenkov.shop.Computer;

public class Sony extends Noutbook {
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор    Alt+insert->Constructor

    public Sony(String name, int HDVolume, String processorName) {
        super(name, HDVolume, processorName);
    }
}
