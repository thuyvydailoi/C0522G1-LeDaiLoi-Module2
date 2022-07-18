package ss11_dsa_stack_queue.exercise.tree_map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        Map<String, Integer> stringMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();

        String[] stringArray = str.split("");
        System.out.println(Arrays.toString(stringArray));

        for (String key : stringArray) {
            if (!stringMap.containsKey(key)) {
                stringMap.put(key,1);
            } else{
                int count =stringMap.get(key);
                stringMap.put(key,count+1);
            }
        }
        System.out.println(stringMap);
    }
}