package com.example.recyclerview;

public class Datamodel {
    private String title;
    private int Image;

    public Datamodel(int image) {
        Image = image;
    }

    public Datamodel(String title) {
        this.title = title;
    }

    public Datamodel(String waterfall, int w1) {

    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return Image;
    }
}
