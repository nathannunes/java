package com.nseit.bankapp03.main;
import com.nseit.bankapp.model.Circle;
import com.nseit.bankapp.model.Rectangle;

public class MainApp {
    public static void main(String[] args){
        Circle g1 = new Circle(10);
        Rectangle g2 = new Rectangle(5,10);

        System.out.println("Rectangle area "+g2.area());
        System.out.println("Rectangle peri "+g2.periphery());
        System.out.println("Circle area    "+ g1.area());
        System.out.println("Circle peri    "+ g1.periphery());
    }
}
