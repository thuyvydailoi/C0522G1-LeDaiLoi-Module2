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
}
