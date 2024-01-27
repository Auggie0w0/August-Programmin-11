package com.example.productmanagement;

public class Product {
    public String name;
    private int quantity;
    private double cost;

    Product(String n, int quant, double cost){
        name = n;
        quantity = quant;
        this.cost = cost; // referring to the cost in public class Product
    }

    //getters and setters
    public void setQuantity(int amt) {
        quantity += amt;
    }

    public int getQuantity() {return  quantity;}

    public void purchase(){
        quantity--;
    }
    public double getCost(){return cost;}

    public String toString() {
        return  name;
    }
}
