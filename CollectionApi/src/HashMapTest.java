import java.util.*;

class maptest{
    int i = 20; String s = "nate";

}

class HashMapTest {
    public static void main(String[] args){
        Map m = new HashMap();

        maptest a = new maptest();
        maptest a1 = new maptest();
        m.put(1,a);
        m.put(1,a1);
        m.put("A","1");
        m.put("B","2");
        m.put("C","4");

        System.out.println(m);
        System.out.println("size of m:  "+m.size());

        Iterator it = m.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }
        System.out.println("\n");
        Set s =  m.keySet();
        it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("The Values....");
        it = m.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
    }
}
