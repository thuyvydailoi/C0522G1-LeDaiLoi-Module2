package demo;
// vẽ hình thoi giải thuật nhóm tuần 1 module 2
public class demo {
    public static void main(String[] args) {
        int height = 6;
        for (int i = 1; i < height; i++) {
            for (int j = 2 * height - i; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 4* i-3; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();

        }
        for (int i = height - 2; i > 0; i--) {
            for (int j = 2 * height - i; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 4 * i-3; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();

        }
    }
//    package ss1_Introduction_to_java.team;
//
//    public class Team {
//        public static void main(String[] args) {
//            for (int i = 1; i <= 9; i++) {
//                for (int j = 1; j <= 10; j++) {
//                    if (j == 6 - i || j == 5 + i) {
//                        System.out.print(i);
//                    } else if (j == i - 4 || j == 15 - i) {
//                        System.out.print(10 - i);
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
}
