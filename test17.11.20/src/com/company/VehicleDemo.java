package com.company;

class Vehicle {
    int passenger; // количество поассажиров
    int fuelcap;   // емкость топливного бака
    int mpg;       // расход топлива в милях на галлон
}

// в этом классе объявляется объект типа Vehicle
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan=new Vehicle(); // создать объект minivan типа Vehicle
        int range; // переменная дальность поездки

        //присвоить значения полям(переменным) в объекте minivan
        minivan.passenger=7;
        minivan.fuelcap=16;
        minivan.mpg=21;

        // Рассчитать дальность поездки при полном баке
        range= minivan.fuelcap*minivan.mpg;
        System.out.println("Фургон может перевезти "+minivan.passenger+" пассажиров на расстояние "+range);
    }
}
