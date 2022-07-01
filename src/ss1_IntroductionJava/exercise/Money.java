package ss1_IntroductionJava.exercise;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner sc = new Scanner((System.in));
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double vnd= usd*rate;
        System.out.print("Giá trị VND: " + vnd );
    }
}
