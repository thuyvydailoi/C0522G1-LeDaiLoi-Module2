package com.company.demo.ss10_dsa.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(100);
        integerSet.add(100);
        integerSet.add(-100);
        integerSet.add(2);
        integerSet.add(-9);
        integerSet.add(15);

        System.out.println(integerSet);
    }
}
