package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.objects.Car;
import ru.javabegin.training.fastjava2.objects.Door;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car=new Car(); // ссылочная переменная car. ей присваивается ссылка на объект Car

        car.setName("Toyota");//вызов car.setName и передаем значение Toyota в имя авто в классе Car
        System.out.println("car.getName()= "+car.getName());// вызов  car.getName() и получение имени авто из класса Car

        Door leftDoor=new Door();// ссылочная переменная leftDoor. ей присваивается ссылка на объект Door

        leftDoor.setColor("красный");//вызов leftDoor.setName и передаем значение Toyota в имя авто в классе Door
        leftDoor.setHeight(1);//--//--
        leftDoor.setMaterial("сталь");//--//--



        System.out.println("Цвет двери: "+ leftDoor.getColor()); // вызов  leftDoor.getName() и получение имени авто из класса Door
        System.out.println("Высота двери: "+ leftDoor.getHeight());
        System.out.println("Материал двери: "+ leftDoor.getMaterial());


    }
}
