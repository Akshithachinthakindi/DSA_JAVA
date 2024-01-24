abstract class Animal {
    abstract void walk();
}
class Horse extends Animal {
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
        obj1.walk();
        Monkey obj2 = new Monkey();
        obj2.walk();
    }
}
