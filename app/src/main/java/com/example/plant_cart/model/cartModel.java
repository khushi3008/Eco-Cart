package com.example.plant_cart.model;

public class cartModel {

    String name;
    String price;
    String image;
    String quantity;

    cartModel(){}

    public cartModel(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getImage() { return image; }

    public String getPrice() { return price; }

    public String getQuantity() { return quantity; }


}
