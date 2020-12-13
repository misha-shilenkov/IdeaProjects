package com.company;

public class Animal {
    public void eat() {
        System.out.println("animal eat");
    }

//-------------------------------------------
public class Dog extends Animal
{
    public void eat(){
        System.out.println("dog eat");
    }
    public void thisEat()
{
        this.eat();
}
    public void superEat(){
        super.eat();
    }
}
}