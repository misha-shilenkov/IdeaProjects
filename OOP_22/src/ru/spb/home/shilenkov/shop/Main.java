package ru.spb.home.shilenkov.shop;

import ru.spb.home.shilenkov.shop.objects.Camry;
import ru.spb.home.shilenkov.shop.objects.Rav4;

public class Main {

    public static void main(String[] args) {

        //конструкторы подцепляются только те что прописаны в классе к которому обращаемся(к дочернему классуCamry) так как конструкторы не наследуются от родительского
        //методы будут цепляться все, и из родительского класса и из дочернего, так как методы наследуются

        //cоздаем объекты(экземпляры) обращаясь к конструкторам из дочернего класса:
        Camry camry=new Camry("50"); // обращение к конструктору с одной переменной name, в классе Camry
        Camry camry1=new Camry("60",3.2);// обращение к конструктору с двумя переменными name и volume, в классе Camry
        Camry camry2=new Camry(5.0);// обращение к конструктору с одной переменной volume, в классе Camry

        //создаем(вызываем) методы:
        camry.getName();
        camry1.getName();
        camry2.getVolume();

        System.out.println("Камри:"+" "+camry.getName()+"\nКамри1:"+" "+camry1.getName()+"\nКамри2:"+" "+camry2.getVolume());

        //cоздаем объекты(экземпляры) обращаясь к конструкторам из дочернего класса Rav4:
        Rav4 rav4=new Rav4("2020 год выпуска",2.4);




    }
}
