package ru.spb.home.shilenkov.shop.Man;

public class Man extends Human {
    double width;
    double height;
    String gender;

    //создаем конструктор собственных свойств класса

    public Man(String eatType, String movingType, double width, double height, String gender) {
        super(eatType, movingType);
        this.width = width;
        this.height = height;
        this.gender = gender;
    }


    // нужно создать конструктор вручную так как это дочерний класс, и конструкторы не наследуются
    // создаем конструктор наследуемых свойств    Alt+insert->Constructor


    public Man(String eatType, String movingType) {
        super(eatType, movingType);
    }
}
