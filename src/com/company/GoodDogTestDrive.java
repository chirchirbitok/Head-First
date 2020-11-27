package com.company;

public class GoodDogTestDrive {
    public static void main(String [] args){
        GoodDog one = new GoodDog();
        one.setSize(62);

        GoodDog two = new GoodDog();
        two.setSize(40);

        GoodDog three = new GoodDog();
        three.setSize(10);

        System.out.println("Dog one" + one.getSize());
        System.out.println("Dog two" + two.getSize());
        System.out.println("Dog three" + three.getSize());
        one.bark();
        two.bark();
        three.bark();
    }
}
