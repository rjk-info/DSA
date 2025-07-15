// package Inheritance;

public class Habrid {
    public static void main(String[] args) {
        Human h1 = new Human() ;
        h1.eat();
    }
}

class Animal {

    void eat() {
        System.out.println("eat");
    }

    void sleep() {
        System.out.println("sleep");
    }
}

class Fish extends Animal {

    void swim(){
        System.out.println("swim");
    }
}

class Tuna extends Fish {
    int count ;
}

class Shark extends Fish {
    int count;
}

class  pecoocke extends Animal {
    
    void fly() {
        System.out.println("fly");
    }
}

class Mammal extends Animal {
    
    void mammal (){
        System.out.println("mammal");
    }
}

class Don extends Mammal {

    void Dod() {
        System.out.println("bark");
    }
}

class Cat extends Mammal {

    void cat() {
        System.out.println("mow mow");
    }
}

class Human extends Mammal {

    void human() {
        System.out.println("Eat");
    }
}