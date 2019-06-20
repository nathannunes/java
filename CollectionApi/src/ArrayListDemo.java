import java.util.*;


public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        arr.ensureCapacity(10);
        System.out.println("size of ArrayList:  "+arr.size());
        arr.add(12);arr.add(35);arr.add(45);
        System.out.println("size of ArrayList:  "+arr.size());
        System.out.println(arr+"\n");
        arr.remove(1);
        System.out.println(arr);
        Iterator i = arr.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("\n");
        Object[] a1 =new Object[4];
        a1 = arr.toArray(a1);
        for (int j=0;j<a1.length;j++){
            System.out.println(a1[j]);
        }

    }

}
