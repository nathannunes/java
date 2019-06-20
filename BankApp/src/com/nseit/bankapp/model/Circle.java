package com.nseit.bankapp.model;
import com.nseit.bankapp.service.Graphics;

public class Circle implements Graphics {
    float radius;

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    @Override
    public float area() {
        return pi*radius*radius;
    }

    @Override
    public float periphery() {
        return 2*pi*radius;
    }
}
