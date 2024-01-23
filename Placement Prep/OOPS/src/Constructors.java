class Students {
    String name;
    int age;
    int reg_num;
    String branch;

    public void Func() {
        System.out.println(this.name);
        System.out.println("Age of " + this.name + " is "+this.age);
        System.out.println("Registration Number of " + this.name + " is "+this.reg_num);
        System.out.println("Branch of " + this.name + " is "+this.branch);
    }
    Students(Students s2) {  // this is a constructor, it has no return type such as void, int, string etc.,
        this.name = s2.name;
        this.age = s2.age;
        this.reg_num = s2.reg_num;
        this.branch = s2.branch;
    }
    Students() {

    }
}
public class Constructors {
    public static void main(String[] args) {

        Students s1 = new Students(); // this is an object for the class that we created
        s1.name = "Akshitha";
        s1.age = 20;
        s1.reg_num = 12002408;
        s1.branch = "CSE";
        Students s2 = new Students(s1);
        s2.Func();
        s1.Func();
    }
}