package ru.spb.home.shilenkov.shop.goods;

import ru.spb.home.shilenkov.shop.department.BaseDepartment;

public class BaseGoods {
    //свойства котороые будут иметь все товары
    private double price;
    private boolean hasGuarantee;
    private  String name;
    private BaseDepartment department; // переменная типа BaseDepartment - привязанность товара к отделу - выбирается родительский класс для всех отделов
    private String company;

}
