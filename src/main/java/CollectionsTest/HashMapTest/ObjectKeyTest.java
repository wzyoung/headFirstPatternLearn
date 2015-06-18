package CollectionsTest.HashMapTest;

import java.util.HashMap;

/**
 * bucket index change by reHash, so can't get value by new hashcode
 *
 * but if a hash collision happened, it can get the current value by changed key.
 *
 * so don't use a object be a key, or don't change the key if you use Object-key.
 *
 * int hash = (key == null) ? 0 : hash(key);
    for (Entry<K,V> e = table[indexFor(hash, table.length)];
 *
 * Created by wzyoung on 2015/6/18.
 */
public class ObjectKeyTest {

    public static void main(String[] args) {


        Person person = new Person();

        person.setName("xiaoming");
        person.setSex("zhinan");


        HashMap<Person, String> map = new HashMap<Person, String>();
        map.put(person, "test");

        System.out.println(map.get(person));

        System.out.println("hashCode before:" + person.hashCode());

        person.setName("hanmeimei");

        System.out.println("hashCode after:" + person.hashCode());

        System.out.println(map.get(person));



    }
}
