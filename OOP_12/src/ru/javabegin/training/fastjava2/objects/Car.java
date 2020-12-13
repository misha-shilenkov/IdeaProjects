package ru.javabegin.training.fastjava2.objects;

public class Car {
//Задаем переменные. Эти переменные будут доступны только внутри этого класса(всего класса и всех методов в классе) Car так как их модификатор доступа задан как private
    private String name; // переменная, объявляемая на уровне класса
    private String color;// переменная, объявляемая на уровне класса
    private int height;// переменная, объявляемая на уровне класса

/*Создание специальных методов геттеров и сеттеров через меню Refactor->Encapsulated Fields*/
/*С их помощью можно будет задавать и принимать значения этих переменных из другого класса*/
    public String getName() {
        return name;
    }

    public void setName(String name) { // тут переменная name объявляется как параметр метода setName
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) { // тут переменная color объявляется как параметр метода setColor
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) { // тут переменная height объявляется как параметр метода setHeight
        this.height = height;
  //-----------------------------------------------------------------
    }
}
