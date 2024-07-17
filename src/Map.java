import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MyMap{
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();//not smartd
        TreeMap<Integer,String>map1=new TreeMap<>();
        map1.put(13,"A");
        map1.put(12,"B");
        map1.put(03,"C");
        System.out.println(map1);//printed in sorted ascending order
        //for reverse
        TreeMap<Integer,String>map2=new TreeMap<>(Collections.reverseOrder());
        map2.put(13,"X");
        map2.put(12,"Y");
        map2.put(03,"Z");

        System.out.println(map2);


        map.put(1,"pratik");
        map.put(2,"subhankar");
        map.put(3,"sayak");
        map.put(4,"Diya");

        map.put(1,map.getOrDefault(1, String.valueOf(0))+" chakraborty ");

        map.putIfAbsent(1,"Rhitam");
        System.out.println(map);

        System.out.println(map.get(4));
        System.out.println(map.getOrDefault(6,"No one"));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("pratik"));

        //Map traversing
        for(Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println("key: "+entry.getKey());
        }
        for(Integer key:map.keySet()){
            System.out.println("key: " + key);
        }
        for(String value:map.values()){
            System.out.println("value: "+value);
        }
    }
}