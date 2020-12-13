package com.company;

public class Test1 {
public static void main(String[] args)
{
    TestPrivate test1=TestPrivate.getTestPrivate();
    TestPrivate test2=TestPrivate.getTestPrivate();
    System.out.println(""+(test1 != null));
    System.out.println(""+(test2 != null));
}
}
