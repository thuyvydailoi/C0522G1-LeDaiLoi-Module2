package ss11_dsa_stack_queue.exercise.palindrome_string;

import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        Stack<String> stringStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ban đầu: ");
        String str1 =scanner.nextLine();

        String[] stringArray = str1.split("");
        System.out.println(Arrays.toString(stringArray));

        for (String string : stringArray){
            stringQueue.add(str1);
            stringStack.add(str1);
        }

        String string1 ="";
        String string2 ="";

        while (!stringQueue.isEmpty()&&!stringStack.isEmpty()){
            string1 += stringQueue.poll();
            string1 += stringStack.pop();
        }

        if(string1.equals(string2)){
            System.out.println("Đây là  PalindromeString!");
        }
        System.out.println("Đây không phải là  PalindromeString!!!");


    }
}
