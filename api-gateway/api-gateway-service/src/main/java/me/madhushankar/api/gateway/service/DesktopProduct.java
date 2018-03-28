package me.madhushankar.api.gateway.service;

public class DesktopProduct {

    private String price;

    private String imgUrl;

    public DesktopProduct(String price, String imgUrl) {
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
