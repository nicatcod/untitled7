package Collections_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MAPinterface {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        System.out.println(map);
        System.out.println(map.get("A"));
        System.out.println(map.remove("F", 6));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry elementlr = (Map.Entry) iterator.next();
            System.out.println(elementlr.getKey() + " " + elementlr.getValue());
        }
    }

}
