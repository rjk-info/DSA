// package Inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.legs = 4 ;
        System.out.println(dog.legs);
    }
}

// Base class
class Animal {
    String color ;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

//Derived Class 

// class Fish extends Animal {
//     int fins ;

//     void swim() {
//         System.out.println("swim in water");
//     }
// }
