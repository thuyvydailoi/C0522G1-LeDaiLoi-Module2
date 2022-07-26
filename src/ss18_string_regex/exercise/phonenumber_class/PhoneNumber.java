package ss18_string_regex.exercise.phonenumber_class;

import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
                System.out.println("Input your number: ");
                String phoneNumber = scanner.nextLine();
                if (phoneNumber.matches("[(][0-9]{2}[)][-][(][0][0-9]{9}[)]")) {
                    System.out.println("Your phone number: " + phoneNumber + " is valid.");
                    break;
                } else {
                    System.out.println("Please input again your number");
                }
        } while (true);
    }
}
