package Oops.inheritance;

public class User {
    String name;
    String email;

    public User(String name,String email){
        this.name = name;
        this.email = email;
    }
    public void login(){
        System.out.println("logging in...");
    }

    public static void main(String[] args) {
//        Test t1 = new Test();
        User u1 = new User("nish","emailnish");
        u1.login();
    }
}
//class Test{
//    Test(){
//        System.out.println("testing");
//    }
//}
