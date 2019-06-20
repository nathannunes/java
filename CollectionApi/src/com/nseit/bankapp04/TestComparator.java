package com.nseit.bankapp04;
import java.util.*;

class ReverseCompareString implements Comparator{
    @Override
    public int compare(Object a, Object b) {
        String ast = (String) a;
        String bst =  (String) b;

        return (bst.compareTo(ast));
    }
}

public class TestComparator {
    public static void main(String[] args){
        ReverseCompareString rcs = new ReverseCompareString();
        TreeSet ts = new TreeSet(rcs);

        ts.add("a");ts.add("b");ts.add("c");ts.add("q");ts.add("h");ts.add("e");ts.add("h");ts.add("n");
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println("Next  "+it.next());
        }

    }
}
