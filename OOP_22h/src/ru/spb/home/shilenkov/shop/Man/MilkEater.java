package ru.spb.home.shilenkov.shop.Man;

public class MilkEater extends Animate {
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор    Alt+insert->Constructor

// конструктор наследуемых свойств
    public MilkEater(String eatType, String movingType) {
        super(eatType, movingType);
    }
}
