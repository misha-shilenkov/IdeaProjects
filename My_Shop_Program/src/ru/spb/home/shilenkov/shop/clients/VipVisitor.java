package ru.spb.home.shilenkov.shop.clients;

public class VipVisitor extends BaseVisitor {
    //задаем свойства класса

    private float discount;//скидка

    //задаем методы класса

    @Override  // переопределяем метод by для VIP-visitor
    public void buy(){
        if (!checkDiscount()){
            super.buy();
        } else {
            // купить со скидкой
        }
    }

    private boolean checkDiscount(){
        return discount>0;
    }

    /*Создание методов геттеров и сеттеров через меню Refactor->Encapsulated Fields
С их помощью можно будет задавать и принимать значения этих переменных из другого класса*/

}
