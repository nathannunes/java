import java.util.*;
public class VectorDemo {
    public static void main(String[] args){
        Vector v = new Vector(25,5);
        System.out.println("initial capacity:  "+v.capacity());

        for (int i=0;i<26;i++){
            v.add(i);
        }
        System.out.println("Capacity after adding elements:  "+v.capacity());
        v.insertElementAt(30,23);
        System.out.println(v);
        System.out.println(v.contains(30));
        System.out.println(v.elementAt(15));

        for(Enumeration e = v.elements();e.hasMoreElements();){
            System.out.println(" "+e.nextElement());
        }
        System.out.println("index value of (20) is:  "+ v.indexOf(20));
        System.out.println("Size of Vector:  "+v.size());
    }
}
