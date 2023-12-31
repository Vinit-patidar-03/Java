import java.util.HashSet;

public class set {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<String>();

        // add item
        set1.add("vinit");
        set1.add("sagar");
        set1.add("gokul");
        set1.add("vinit");
        System.out.println(set1);

        // loop in hashset
        for (String item : set1) {
            System.out.println(item);
        }

        // size of set
        System.out.println(set1.size());

        // contains
        System.out.println(set1.contains("vinit"));

        // remove item
        System.out.println(set1.remove("gokul"));
        System.out.println(set1);

        // clear all items
        set1.clear();
        System.out.println(set1);

    }
}
