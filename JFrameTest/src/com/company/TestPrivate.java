package com.company;

public class TestPrivate /*extends Main*/ {
private static TestPrivate instance;
public static TestPrivate getTestPrivate(){
    if (instance==null)
        instance=new TestPrivate();
    return instance;
        }
        public static void main(String[] args) {
            System.out.println("Hello="+instance);
        }
}
