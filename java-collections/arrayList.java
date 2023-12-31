import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

    // execution starts from main function
    public static void main(String[] args) {

        // ArrayList Types: String, Integer, Boolean, Character and Double.
        ArrayList<String> arr = new ArrayList<String>();

        // add item
        arr.add("vinit");
        arr.add("sagar");
        arr.add("piyush");
        arr.add("himanshu");

        // access item
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr);

        // size of array
        System.out.println(arr.size());

        // sort array
        Collections.sort(arr);
        System.out.println(arr);

        // overWrite items
        arr.set(1, "dipanshu");
        System.out.println(arr);

        // remove item
        arr.remove(3);
        System.out.println(arr);

        // loop in arraylist
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // forEach loop
        for (String item : arr) {
            System.out.println(item);
        }

        // remove all the items
        arr.clear();
        System.out.println(arr);
    }
}