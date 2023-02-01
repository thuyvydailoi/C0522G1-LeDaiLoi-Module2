package demo;

import java.util.*;

public class SecondNumber {

    public static void main(String[] args) {
        int arr[] = {300, 44, 10, 12, 34, 100, 1, 300, 44};
        Set<Integer> set = new TreeSet<>();
        for (int element : arr) {
            set.add(element);
        }
        System.out.println(set);

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        System.out.println(list.get(list.size() - 2));
    }

}
