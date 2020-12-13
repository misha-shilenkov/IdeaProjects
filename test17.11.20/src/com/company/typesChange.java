package com.company;


//-----------Преобразование типов в выражениях-------------

//----------char,byte,short-->int-->long-->float-->double

public class typesChange {
    public static void main(String args[]) {
        byte b;
        int i;

        b=10;//тут b типа byte
        i=b*b;//тут b автоматически повышается до типа int
        System.out.println("i and b: "+i+" "+b);

        b=10;// тут b типа int
        b=(byte)(b*b);// принудительное приведение b к типу byte
        System.out.println("i and b: "+i+" "+b);
//--------------------------------------------------------------
        //----Приведение типов для правильного вычисления выражения
        int f;
        for (f=0;f<5;f++){
            System.out.println(f+" / 3 типа int равно: "+f/3);
            System.out.println(f+" / 3 c дробной частью  типа doble равно: : "+(double)f/3);
            System.out.println();
        }
        int d;
        for(d=2;d<101;d++){


            System.out.println("summa : "+d);
        }

    }
}
