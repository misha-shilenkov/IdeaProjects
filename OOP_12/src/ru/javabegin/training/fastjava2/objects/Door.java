package ru.javabegin.training.fastjava2.objects;

public class Door {
    //Задаем переменные. Эти переменные будут доступны только внутри этого класса(всего класса и всех методов в классе) Door так как их модификатор доступа задан как private
    private String material; // переменная, объявляемая на уровне класса
    private String color; // переменная, объявляемая на уровне класса
    private int height; // переменная, объявляемая на уровне класса


    //---тестовый метод
    public static void test(){
        int count=0;// переменная объявляемая на уровне метода. Она будет доступна только внутри этого метода. Тут не ставят модификатор доступа для переменной

    }


    /*Создание методов геттеров и сеттеров через меню Refactor->Encapsulated Fields*/
    /*С их помощью можно будет задавать и принимать значения этих переменных из другого класса*/

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) { // тут переменная material объявляется как параметр метода setMaterial
        this.material = material;
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
    }



}
