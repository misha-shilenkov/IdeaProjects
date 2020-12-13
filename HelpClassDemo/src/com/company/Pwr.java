package com.company;

public class Pwr {
   // определяем какие поля будут у объетов класса Pwr
    double b; // поле объекта
    int e;// поле объекта
    double vr_per;// поле объекта


    //Конструктор Pwr с принимаемыми значениями base и exp
    Pwr(double base, int exp){
        b=base; // переменной(полю) b  присваивается возвращаемое значение base
        e=exp; // переменой(полю) е присваивается возвращаемое значение exp
     //   папа как дела у меня хорошо я не хочу ити в школу

        vr_per=1;
        if (exp==0) return; // если степень в которое возводится число равна 0, то возвращаемся и val не меняем, оставляем равной 1
        // для других значений степени:
        // перемножаем возводимое в степень число "base"
        // само на себя по количеству степени
        //(vr_per используется для пересохранения результата умножения числа "base" на само себя)

        for (exp=e;exp>0;exp--) vr_per=vr_per*base;
    }

    //----метод get_pwr возвращает значение переменной vr_per типа double
    // которая равна либо 1 (когда степень=0),
    // либо результату перемножения базового числа "base" самого на себя столько раз чему равна степень
    double get_pwr() {
        return vr_per;
    }
}
class MyCounter {
    double delenie;
    int a, b;

// конструктор класса. Название совпадает с классом
    MyCounter(int chisl, int znam) {
        a=chisl;
        b=znam;
        delenie=a/b;
        return;
    }


    double getMyCounter() {
return delenie;

    }
}

class DemoPwr {
    public static void main(String[] args) {
        Pwr x=new Pwr(4.0,2); // создали объект "x" класса Pwr и присвоили значения полям base и exp в этом объекте
        Pwr y=new Pwr(2.5,1);// создали объект "y" класса Pwr и присвоили значения полям в этом объекте
        Pwr z=new Pwr(5.7,0);// создали объект "z" класса Pwr и присвоили значения полям в этом объекте
        System.out.println(x.b+" в степени "+ x.e+" равно "+ x.get_pwr());
        System.out.println(y.b+" в степени "+ y.e+" равно "+ y.get_pwr());
        System.out.println(z.b+" в степени "+ z.e+" равно "+ z.get_pwr());

        MyCounter f=new MyCounter(20,5);
        MyCounter g=new MyCounter(22,11);
        MyCounter h=new MyCounter(40,8);
        System.out.println(f.a+" деленное на "+ f.b+" равно "+ f.delenie);
        System.out.println(g.a+" деленное на "+ g.b+" равно "+ g.delenie);
        System.out.println(h.a+" деленное на "+ h.b+" равно "+ h.delenie);
    }
}

