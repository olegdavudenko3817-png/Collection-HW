package ExampleOne;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OptionTwo {

    public static int methodLinkedList(int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }


        ListIterator<Integer> listIt = list.listIterator();

        while (list.size() > 1) {
            for (int count = 0; count < 2; count++) {
                if (!listIt.hasNext()) {
                    listIt = list.listIterator();
                }
                listIt.next();
            }
            listIt.remove();
        }

        return list.get(0);

    }

    public static void main(String[] args) {

        int n = 5;
        int result = methodLinkedList(n);
        System.out.println("The last one: " + result);

    }
}
