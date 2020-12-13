package ru.spb.home.shilenkov.shop.department;

import ru.spb.home.shilenkov.shop.emloyee.BaseEmployee;
import ru.spb.home.shilenkov.shop.goods.BaseGoods;

import java.util.ArrayList;

public class BaseDepartment { // Отдел
    //задаем свойства класса
    private String name;
    private ArrayList<BaseGoods> goodsList; // переменная типа "коллекции" - список товаров
    private ArrayList<BaseEmployee> employeeList;// переменная типа "коллекции" - список сотрудников
                /*Создание методов геттеров и сеттеров через меню Refactor->Encapsulated Fields
    С их помощью можно будет задавать и принимать значения этих переменных из другого класса*/
}
