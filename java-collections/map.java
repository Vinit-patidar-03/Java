import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // add item
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);

        // loops in hashmap
        for (String item : map.keySet()) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (Integer item : map.values()) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (String item : map.keySet()) {
            System.out.print(map.get(item) + " ");
        }
        System.out.println();

        // size of map
        System.out.println(map.size());

        // access item
        System.out.println(map.get("one"));

        // remove item
        map.remove("two");
        System.out.println(map);

        // clear all item
        map.clear();
        System.out.println(map);
    }
}
