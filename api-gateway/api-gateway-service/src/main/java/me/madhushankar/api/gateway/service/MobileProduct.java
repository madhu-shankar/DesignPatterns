package me.madhushankar.api.gateway.service;

public class MobileProduct {

    private String price;

    public MobileProduct(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
