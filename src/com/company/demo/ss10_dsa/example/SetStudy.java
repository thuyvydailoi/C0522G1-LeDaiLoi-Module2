package com.company.demo.ss10_dsa.example;

import java.util.ArrayList;
import java.util.List;

public class SetStudy {
    public static void main(String[] args) {
        //geranic
        List<Integer> intergers = new ArrayList<>();

        intergers.add(10);
        intergers.add(20);
        intergers.add(30);
        intergers.add(40);
//        intergers.add(40.0);
//        intergers.add("Tran Thi Thuy Vy");
//
//        for (Object o : intergers){
//            if( o instanceof Integer){
//                Integer x=(Integer) o;
//            }
//        }
//        intergers.add(4,100);
//        intergers.set(4,100);
//        intergers.set(0,1000);

        Integer x = 10;
//        intergers.remove(Integer.valueOf(10));
        intergers.remove(x);

//        System.out.println(intergers.get(0));
        System.out.println(intergers);
    }
}
