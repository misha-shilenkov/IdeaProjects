package ru.spb.home.shilenkov.shop.Man;

public class OldMan extends Man{
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор    Alt+insert->Constructor


    public OldMan(String eatType, String movingType, double width, double height, String gender) {
        super(eatType, movingType, width, height, gender);
    }

    public OldMan(String eatType, String movingType) {
        super(eatType, movingType);
    }
}
