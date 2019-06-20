package com.nseit.bankapp.model;
import com.nseit.bankapp.service.Graphics;

public class Rectangle implements Graphics{
    int width,height;

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public float area() {
        return width*height;
    }

    @Override
    public float periphery() {
        return 2*(width+height);
    }
}
