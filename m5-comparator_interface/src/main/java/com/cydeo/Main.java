package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);
        System.out.println(list);

        Collections.sort(list); // ascending
        System.out.println(list);

        //Collections.reverse(list);
        //System.out.println(list);

        Collections.sort(list, new MyComparator());

        Collections.sort(list, ((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));

        // ascending

        list.sort((o1, o2) -> o1.compareTo(o2));
        list.sort(Integer::compareTo);
        System.out.println(list);

        // descending

        list.sort((o2,o1)->o1.compareTo(o2));
        list.sort(Comparator.reverseOrder());
        System.out.println(list);


    }
}
