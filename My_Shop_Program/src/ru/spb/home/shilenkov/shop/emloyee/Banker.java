package ru.spb.home.shilenkov.shop.emloyee;

import ru.spb.home.shilenkov.shop.bank.BaseBank;

public class Banker extends BaseEmployee {
    //задаем свойства класса
    private BaseBank bank;// переменная типа BaseBank - привязанность сотрудника к банку - выбирается родительский класс для всех банков
                            //BaseBank bank - это композиция

    //задаем методы класса
    public void sendRequest(){
        // отправка запроса в банк

    }
    /*Создание методов геттеров и сеттеров через меню Refactor->Encapsulated Fields
С их помощью можно будет задавать и принимать значения этих переменных из другого класса*/













}
