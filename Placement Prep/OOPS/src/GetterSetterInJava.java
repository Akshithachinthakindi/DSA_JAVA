class Account {
    String name;
    String email;
    String password;

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

public class GetterSetterInJava {
    public static void main(String[] args) {
        Account obj1 = new Account();
        obj1.setPassword("AkSa1111");
        System.out.println(obj1.getPassword());
    }
}
