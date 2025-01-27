package basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/*Key Methods of HashMap
Basic Operations:
put(K key, V value): Adds a key-value pair to the map.
get(Object key): Retrieves the value associated with a key.
remove(Object key): Removes the mapping for a key.


Advanced Operations:
containsKey(Object key): Checks if a key is present.
containsValue(Object value): Checks if a value is present.
size(): Returns the number of key-value pairs.
keySet(), values(), entrySet(): Provide views of keys, values, and key-value pairs.



Homework : examples all operations


*/


public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(01,100);
        map.put(02,200);
        map.put(03,300);
        map.put(04,400);




        Set<Integer> integers = map.keySet();
        for(Integer item:integers){
            Integer value = map.get(item);
            System.out.println("key : "+item+" value :"+value);
        }

        for (Integer value : map.values()) {

        }


        System.out.println(map.toString());


    }


}
