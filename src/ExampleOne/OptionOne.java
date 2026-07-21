package ExampleOne;

import java.util.ArrayList;
import java.util.List;


public class OptionOne {

    public static int methodArrayList(int n) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;

        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }

        return list.get(0);

    }


    public static void main(String[] args) {

        int n = 10;
        int result = methodArrayList(n);
        System.out.println("Последним остался: " + result);
    }
}
