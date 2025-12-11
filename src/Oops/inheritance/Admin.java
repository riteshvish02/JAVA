package Oops.inheritance;

public class Admin extends User{

    public Admin(String name,String email){
        super(name,email);
    }

    @Override
    public void login(){
        this.name = "modiji";
        super.login();
        System.out.println("admin login");
    }
    public void display(){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Admin a1 = new Admin("salman","katrina's email");
        a1.display();
        a1.login();
        a1.display();
    }
}
