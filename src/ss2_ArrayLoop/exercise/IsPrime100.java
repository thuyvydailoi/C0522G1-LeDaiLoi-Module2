package ss2_ArrayLoop.exercise;

public class IsPrime100 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhập số: ");
//        int number = input.nextInt();
//        if (number < 2) {
//            System.out.println();
//        } else {
//
//            int count = 2;
//            boolean check = true;
//            while (count < number) {
//                if (number % count == 0) {
//                    check = false;
//                    break;
//                }
//                count++;
//            }
//            if (check) {
//                System.out.println("Các số nguyên tốt là : " + number);
//            }
//        }
//    }
//}
        System.out.println("Các số nguyên tố nhỏ hơn 100: ");
        for (int i = 2; i < 100; i++) {
            boolean checkNumber = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    checkNumber = false;
                    break;
                }
            }
            if (checkNumber) {
                System.out.print(i + ", ");
            }
        }
    }
}
