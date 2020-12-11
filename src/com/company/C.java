package com.company;

public class C extends B{
    void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }

    public static void main (String [] args){
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        c.m1();
        b.m2();
        c.m3();
    }
}
