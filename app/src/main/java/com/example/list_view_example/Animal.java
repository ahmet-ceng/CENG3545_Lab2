package com.example.list_view_example;

public class Animal {
    private String type;
    private int picId;

    public Animal(String type, int picId) {
        this.type = type;
        this.picId = picId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public String getType() {
        return type;
    }

    public int getPicId() {
        return picId;
    }
}
