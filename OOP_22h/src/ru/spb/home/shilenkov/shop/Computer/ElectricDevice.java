package ru.spb.home.shilenkov.shop.Computer;

public class ElectricDevice {

    // Задаем свойства родительского класса
    private String name;
    private String motherBoard;
    private int HDVolume;
    private String processorName;

    // создаем конструкторы со всеми переменными    Alt+insert->Constructor


    public ElectricDevice(String name, String motherBoard, int HDVolume, String processorName) {
        this.name = name;
        this.motherBoard = motherBoard;
        this.HDVolume = HDVolume;
        this.processorName = processorName;
    }
}
