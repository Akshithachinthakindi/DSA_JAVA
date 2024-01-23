class Shape{
    String color;
    public void Func() {
        System.out.println("Print something");
    }
}
class Triangle extends Shape{
    public void Func(int l, int b) {
        System.out.println(1/2*l*b);  // this is single level inheritance
    }
}
class RightAngleTriangle extends Triangle {
    public void Func(int l, int b) {
        System.out.println(1/2*l*b);  // this is multi level inheritance
    }
}

class Circle extends Shape{
    public void Func(int r) {
        System.out.println((3.14)*r*r);  // this is hierarchical inheritance
    }
}

public class Inheritance {
    public static void main(String[] args) {

    }
}
