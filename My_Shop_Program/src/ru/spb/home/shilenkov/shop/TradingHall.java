package ru.spb.home.shilenkov.shop;

import ru.spb.home.shilenkov.shop.clients.BaseVisitor;
import ru.spb.home.shilenkov.shop.department.BaseDepartment;
import ru.spb.home.shilenkov.shop.emloyee.Administrator;

import java.util.ArrayList;

public class TradingHall {
    private ArrayList<BaseDepartment> departmentList;// список(набор) отделов - из родительского класса
    private String name;
    private ArrayList<BaseVisitor> visitorList;// список(набор) поситителей - из родительского класса
    private Administrator administrator;// список(набор) администраторов - из родительского класса


}
