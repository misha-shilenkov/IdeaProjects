package ru.spb.home.shilenkov.shop.Computer;

public class EVM extends ElectricDevice {
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор    Alt+insert->Constructor


    public EVM(String name, String motherBoard, int HDVolume, String processorName) {
        super(name, motherBoard, HDVolume, processorName);
    }
}

