package com.company;
//-------------добавление метода range() в класс Vehicle
class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap;//емкость топливног обака
    int mpg;//расход топлива в милях на галон
    int speed;//скорость
    float way;// путь в км
    int v1, v2;

    //---отобразщить дальность поездки
//метод range() с возвращаемыми значениями
    int range() {
        return mpg*fuelcap;
    }

//метод timeToDrive() без возвращаемых значений
    void timeToDrive() {
        System.out.println("Время в пути при скорости "+speed+" составит "+way/speed+" часов");
    }

    //-----Рассчитать объем топлива необходимого машине для прелодаления заданного расстояния
    double fuelNeeded(int miles){
        return(double) miles/mpg;
    }

    void myMeth(){
        int i;
        for (i=0; i<10;i++){
            if (i==5) return;// завершить цикл на значении 5
            System.out.println("цикл завершился на 5 повторении");
        }
    }



}
class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan=new Vehicle();
        Vehicle sportcar=new Vehicle();
        double gallons;
        int dist=252;


        int range1,range2;
        //присвоить значения полям в объекте minivan
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;
        minivan.way=500;
        minivan.speed=120;
        //-----



        //присвоить значения полям в объекте sportcar
        sportcar.passengers=2;
        sportcar.fuelcap=14;
        sportcar.mpg=12;
        sportcar.way=500;
        sportcar.speed=220;

      /*  //Получить дальности поездки для разных транспортных средств из метода range()
        range1= minivan.range();
        range2= sportcar.range();*/

        System.out.println("минивэн может перевезти "+minivan.passengers+" пассажиров на расстояение "+minivan.range()+" миль");


        minivan.timeToDrive();
        System.out.println();

        minivan.myMeth();
        System.out.println();

        System.out.println("Спорткар может перевезти "+sportcar.passengers+" пассажиров на расстояние "+sportcar.range()+" миль");

        sportcar.timeToDrive();
        System.out.println();
        /*int v1= minivan.range();
        int v2= sportcar.range();*/

        if (minivan.range()> sportcar.range()) System.out.println("путь минивена больше пути спорткара");

        //------------------------------
        gallons=minivan.fuelNeeded(dist);
        System.out.println("Для преодаления "+dist+" миль, минивену требуется "+gallons+" галлонов топлива");

        gallons= sportcar.fuelNeeded(dist);
        System.out.println("Для преодаления "+dist+" миль, спорткару требуется "+gallons+" галлонов топлива");




    }
}
