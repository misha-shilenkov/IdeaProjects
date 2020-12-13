package ru.spb.home.shilenkov.shop.objects;

// класс Camry50 наследуется от класса Camry30. класс Camry30 является родительским. // класс Camry50 наследуется от класса Camry30. класс Camry30 является родительским.

public class Camry50 extends Camry30 {  //extends - наследовать
    // это ткласс наследует методы с модификатором доступа public из класса Camry30
    // поэтому ту их можно не объявлять

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    //ЕСЛИ всетаки НУЖНО МЕТОД ПЕРЕОПРЕДЕЛИТЬ то используется @Override (нужно начать набирать имя метода который нужнго переопределить)


    @Override // переопределение метода
    public void drive() {
 //       super.drive();
        System.out.println("Выполнен переопределенный метод drive в классе Camry50");
    }
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    // ВЫЗОВ РОДИТЕЛЬСКОГО МЕТОДА В ДОЧЕРНЕМ КЛАССЕ: нужно в любом методе дочернего класса набрать: "super.имя_метода_в_родительском_классе
    public void speech(){
        super.stop(); // будет выполнен метод stop из РОДИТЕЛЬСКОГО класса Camry30
        // ключевое слово супер позволяет вызывать метод родительского класса из дочернего (будет выполняться первый найденый в цепочке метод)


    }
    public void light(){
        System.out.println("Выполнен самостоятельный метод light из класса Camry50");
    }


}
