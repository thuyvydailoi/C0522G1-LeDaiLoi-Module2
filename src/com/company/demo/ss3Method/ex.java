package com.company.demo.ss3Method;

public class ex {
        static public int X = 2;

        public static void main(String[] args) {
            ex o1 = new ex();
            ex o2 = new ex();
            o2.X = 5;
            System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, ex.X);
        }
    }
