package com.company;

public class Image {
    private String image;

    public Image(String image) {
        this.image = image;
    }

    public void print() {
        System.out.println("Image with name:" + this.image);
    }
}
