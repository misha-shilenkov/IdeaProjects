package ru.spb.home.shilenkov.shop.emloyee;

import ru.spb.home.shilenkov.shop.department.BaseDepartment;

public class BaseEmployee {
    // родительский класс для охраны, кассира, банкир,консультант
    private String name;
    private BaseDepartment department; // переменная типа BaseDepartment - привязанность сотрудника к отделу - выбирается родительский класс для всех отделов
    private boolean free; // индикатор занят/свободен



}
