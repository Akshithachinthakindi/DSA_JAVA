package OOPS;

abstract class Animal {
    abstract void walk();
    public void eats() {
        System.out.println("Animals Eat");
    }
    Animal() {
        System.out.println("Animal Constructor is called");
    }
}
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Monkey extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse obj1 = new Horse();
//        obj1.walk();
//        obj1.eats();
//        Monkey obj2 = new Monkey();
//        obj2.walk();
//        obj2.eats();
    }
}
