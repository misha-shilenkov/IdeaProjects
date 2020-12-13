package com.company;


class TwoVehicle {
    public static void main(String[] args) {
        Vehicle multiVan=new Vehicle();
        Vehicle sportCar=new Vehicle();

        int range1, range2;

        // Присвить значения полям(переменным) в  объекте multivan
        multiVan.passenger=7;
        multiVan.fuelcap=16;
        multiVan.mpg=21;

        // Присвить значения полям(переменным) в  объекте sportCar
        sportCar.passenger=2;
        sportCar.fuelcap=14;
        sportCar.mpg=12;

        //// Рассчитать дальность поездки при полном баке
        range1= multiVan.fuelcap* multiVan.mpg;
        range2= sportCar.fuelcap* sportCar.mpg;

        System.out.println("Фургон может перевезти "+multiVan.passenger+"пассажиров на расстояние "+range1+" миль.");
        System.out.println("sportCar может перевезти "+sportCar.passenger+"пассажиров на расстояние "+range2+"миль.");

    }
}
