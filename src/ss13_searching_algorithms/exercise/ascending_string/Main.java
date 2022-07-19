package ss13_searching_algorithms.exercise.ascending_string;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        String string = scanner.nextLine();

        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            list1.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list1.get(list1.size() - 1)) {
                    list1.add(string.charAt(j));
                }
            }
            if (list1.size() > list.size()) {
                list.clear();
                list.addAll(list1);
            }
            list1.clear();
        }

        for (Character character : list)
            System.out.print(character);
    }
}
