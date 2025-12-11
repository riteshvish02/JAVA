package Oops.abstraction;

public abstract class Product {

    protected String name;
    protected double price;
    protected int stocks;
    public Product(String name,double price,int stocks){
        this.price = price;
        this.name = name;
        this.stocks = stocks;
    }
    public abstract double calculateTax();
    public abstract double calculateDiscount();
    public abstract int availability();
}
