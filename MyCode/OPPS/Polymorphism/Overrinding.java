// package Polymorphism;

public class Overrinding {
    public static void main(String[] args) {
        Deer d = new Deer() ;
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats anytihin");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}