package ru.spb.home.shilenkov.shop.Man;

public class Woman extends Human{
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор наследуемых свойств    Alt+insert->Constructor

    public Woman(String eatType, String movingType) {
        super(eatType, movingType);
    }
}
