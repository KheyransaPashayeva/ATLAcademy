package lesson40;

import java.util.HashMap;
import java.util.Hashtable;

public class HasMap {
    public static void main(String[] args) {
//        random siralayir adeten kicikden boyuye dogru
        HashMap<Long,String> hashMap=new HashMap<>();
        hashMap.put(1L,"Gunel");
        hashMap.put(2L,"Gunel");
        hashMap.put(3L,"Gunel");
        hashMap.put(4L,"Gunel");

//        random siralayir adeten boyukden kiciye dogru
        Hashtable<Long,String> hashtable=new Hashtable<>();
        hashtable.put(1L,"Ceyhune");
    }
}
