public class _6Abstraction {
    public static void main(String[] args) {
        // Hourse h = new Hourse() ;
        // h.eat(); 
        // h.walk();
        // System.out.println(h.color);

        Mustang myhours = new Mustang() ;
        
    }
}


abstract class Animal {

    String color ;

    // Animal() {
    //     color = "brown" ;
    // }

    Animal() {
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}


class Hourse extends Animal {


    Hourse() {
        System.out.println("Hourse constructor called");
    }
    void changeColor(){
        color = "dark brown" ;
    }

    void walk() {
        System.out.println("walk on 4 lages");
    }
}

class Mustang extends Hourse {
    Mustang() {
        System.out.println("Mustang called");
    }
}
class Chicken extends Animal {

    void changeColor() {
        color = "yellow" ;
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}