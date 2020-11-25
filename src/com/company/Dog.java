package com.company;

public class Dog {
    String name;

    public static void main (String[] args){

    //make the dog object and access it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "Piro";

    Dog[] myDogs = new Dog[3];
    //dogs in the array
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;

    //accessing the dog from the array
        myDogs[0].name = "Fred";
        myDogs[1].name = "Merge";

        System.out.println("Last dog's name is" );
        System.out.println(myDogs[2].name);

        int x = 0;

        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;

        }

    }

    private void bark() {
        System.out.println("Ilajil is barking"
        );
    }
}
