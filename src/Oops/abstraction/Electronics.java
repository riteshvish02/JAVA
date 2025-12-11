package Oops.abstraction;

public class Electronics extends Product{

    public Electronics(String name,double price,int stocks){
        super(name,price,stocks);
    }

    @Override
    public int availability() {
        return this.stocks;
    }

    @Override
    public double calculateDiscount() {
        return this.price/10;
    }

    @Override
    public double calculateTax() {
        return this.price/5;
    }

    public static void main(String[] args) {
        Electronics tv = new Electronics("tv",50000,150);
//        System.out.println(tv.name);
        tv.calculateDiscount();
        tv.calculateTax();
    }
}
