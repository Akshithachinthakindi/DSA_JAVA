class Pen {
    String color;
    String type;
    public void Func1() {
        System.out.println(this.color);
        System.out.println(this.type);
    }

}
public class OOPS{
    public static void main(String[] args) {
        Pen pen1 = new Pen();   // creating an object for the class that we have created before above
        pen1.color = "Orange";
        pen1.type = "ball point";
        pen1.Func1();
        Pen pen2 = new Pen();  // creating another object for the class since there can many pens and different types (for eg)
        pen2.color = "blue";
        pen2.type ="gel";
        pen2.Func1();
    }
}