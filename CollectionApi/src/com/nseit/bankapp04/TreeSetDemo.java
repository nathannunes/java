package com.nseit.bankapp04;
import java.util.*;

public class TreeSetDemo{
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add(23);
        ts.add(54);
        ts.add(78);
        System.out.println("size: "+ts.size());
        System.out.println("contents: "+ts);
        System.out.println("first element: "+ts.first());
        System.out.println("Empty ? : "+ts.isEmpty());

    }
}