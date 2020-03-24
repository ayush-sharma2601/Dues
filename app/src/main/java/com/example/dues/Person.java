package com.example.dues;

public class Person {
    private String name;
    private int imgID;

    public Person(String name, int imgID) {
        this.name = name;
        this.imgID = imgID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }
}
