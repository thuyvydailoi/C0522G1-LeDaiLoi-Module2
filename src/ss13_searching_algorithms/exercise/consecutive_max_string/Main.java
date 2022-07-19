package ss13_searching_algorithms.exercise.consecutive_max_string;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> max = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        System.out.println("Nhập chuỗi bất kỳ: ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 &&
                    string.charAt(i) <= list.get(list.size() - 1) &&
                    list.contains(string.charAt(i))) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            }
            for (Character character : max) {
                System.out.print(character);
        }
    }
}
