package ru.spb.home.shilenkov.shop.start;

import ru.spb.home.shilenkov.shop.objects.Camry50;

public class Main {

    public static void main(String[] args) {
	// Создадим экземпляр класса Camry50
        Camry50 camry50=new Camry50();
        camry50.drive(); //метод drive переопределен в классе Camry50 и его наследование не происходит
        camry50.stop(); //метод drive для экземпляра(объекта) класса Camry50  сам подтягивается когда ставищь точку, хотя он явно не объявлен в этом классе, а наследуется от Camry30
        camry50.light();// самостоятельный метод в классе Camry50. Его нет в классе Camry30
        camry50.speech(); // метод speech в классе Camry50 выполняет метод stop в классе Camry30 по ключевому слову super

    }
}
