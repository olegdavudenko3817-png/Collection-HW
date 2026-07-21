import java.util.ArrayList;
import java.util.List;


public class ExampleTwo {

    public static void methodList() {

        List<String> list = new ArrayList<String>();

        list.add("Каталог");
        list.add("Подкаталог 1");
        list.add("Подкаталог 2");


        for (String el : list) {
            System.out.println(el);
        }
    }



    public static void main(String[] args) {
            methodList();
    }
}
