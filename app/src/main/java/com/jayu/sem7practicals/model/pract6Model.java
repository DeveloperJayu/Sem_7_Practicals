package com.jayu.sem7practicals.model;

public class pract6Model {
    String name;
    String address;
    int image;

    public pract6Model(String name, String address, int image){
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

}
