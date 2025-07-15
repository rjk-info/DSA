public class MultupleI {
    public static void main(String[] args) {
        Bear b = new Bear() ;
        b.eat();
        b.sleep();
    }
}

interface Herbibore {
   abstract void eat();
}

interface Carnivore {
    abstract void sleep();
}

class Bear implements Herbibore , Carnivore {

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}