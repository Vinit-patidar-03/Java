import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        // ArrayList Types: String, Integer, Boolean, Character and Double.
        ArrayList<String> arr = new ArrayList<String>();

        // add item
        arr.add("vinit");
        arr.add("sagar");
        arr.add("piyush");
        arr.add("himanshu");

        // creating iterator
        Iterator<String> it = arr.iterator();

        // looping through collection
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // remove element
        it.remove();
        System.out.println(arr);
    }
}
