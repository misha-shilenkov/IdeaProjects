package ru.javabegin.training.fastjava2.object;

// объект House
public class House {
    // свойства объекта House
    private String color="Black";
    private String style="modern";
    private String price="big";
    private int roomCount=5;


    /*--------Добавим методы для объекта House--------*/
// Метод включить отопление
    public void turnOnHeating(){

    }

    // Метод включить освещение
    public void turnOnLighting(){

    }
    /*--------Добавим методы для объекта House--------*/
    /*
    -----------------Работа модификаторов доступа---------------
    -----------------Ограничение доступа к методам, классам, переменным-----------
    * Modifier        | Class |  Package  |  Subclass  |  World  |
    * ----------------|-------|-----------|------------|---------|
    * public          |  Y    |     Y     |    Y       |   Y     |
    * protected       |  Y    |     Y     |    Y       |   N     |
    * no modifierd    |  Y    |     Y     |    N       |   N     |
    * private         |  Y    |     N     |    N       |   N     |
    *
    *
    * */


}
