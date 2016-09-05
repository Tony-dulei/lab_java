package lab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapLab {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("map", "HashMap");
        map.put("schildt", "java2");
        System.out.println(map.keySet());
        System.out.println(map.values());

        SortedMap sortedMap = new TreeMap();
        sortedMap.put("map", "TreeMap");
        sortedMap.put("schildt", "java2");
        System.out.println(sortedMap.keySet());
        System.out.println(sortedMap.values());

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("map", "LinkedHashMap");
        linkedHashMap.put("schildt", "java2");
        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.values());
    }

}
