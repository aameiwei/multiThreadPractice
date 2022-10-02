package collections.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 描述：     TODO
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> a =new ConcurrentHashMap<String,String>();
        String put = a.put("a", "a");
        System.out.println(put);
    }

}
