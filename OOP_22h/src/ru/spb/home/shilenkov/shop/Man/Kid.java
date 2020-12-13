package ru.spb.home.shilenkov.shop.Man;

public class Kid extends Man {
    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор наследуемых свойтсв  Alt+insert->Constructor


    public Kid(String eatType, String movingType) {
        super(eatType, movingType);
    }

    public Kid(String eatType, String movingType, double width, double height, String gender) {
        super(eatType, movingType, width, height, gender);

        // конструктор наследуемых свойств от класса Man


    }
}
