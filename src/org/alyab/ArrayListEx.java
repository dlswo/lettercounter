package org.alyab;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //create(insert)
        list.add("AAA0");
        list.add("AAA1");
        list.add("AAA2");
        list.add("AAA3");
        System.out.println(list);

        //read
        System.out.println(list.remove(0));
        System.out.println(list);

        //update
        list.set(0,"zzzz");
        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));

        }

        list.stream().forEach(x -> System.out.println(x));

        Collections.shuffle(list);
        System.out.println(list);

    }
}
