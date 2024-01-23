class Student{
    String name;
    int age;


//    this is compile time/ function overloading polymorphism
    public void myFunc(String name) {
        System.out.println(this.name);   // each function should either have diff return type or parameters
    }
    public void myFunc(int age) {
        System.out.println(this.age);
    }
    public void myFunc(String name, int age) {
        System.out.println(this.name + " " + this.age);  // if here we pass string name again it gives error so we added another parameter
    }
}
public class Ploymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Akshitha";
        s1.age = 20;
        s1.myFunc(s1.name, s1.age);
        s1.myFunc(s1.name);
        s1.myFunc(s1.age);
    }
}
