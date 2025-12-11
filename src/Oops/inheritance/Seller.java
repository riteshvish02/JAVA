package Oops.inheritance;

public class Seller extends User{

    public Seller(String name,String email){
        super(name,email);
    }
    public void manageproducts(){
        System.out.println("managing products....");
    }

    public static void main(String[] args) {
        Seller s1 = new Seller("ritesh","email.com");
        s1.login();
        s1.manageproducts();
    }
}
