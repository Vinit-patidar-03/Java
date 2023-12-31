import java.util.LinkedList;

public class List {

    public static void main(String[] args) {

        // All the things are very similar to ArrayList.
        LinkedList<String> list = new LinkedList<String>();

        // add items
        list.add("vinit");
        list.add("ram");
        list.add("shyam");
        list.add("pappu");
        System.out.println(list);

        // addFirst
        list.addFirst("komal");
        System.out.println(list);

        // addLast
        list.addLast("monika");
        System.out.println(list);

        // getFirst & getLast
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // removeFirst & removeLast
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

    }
}
