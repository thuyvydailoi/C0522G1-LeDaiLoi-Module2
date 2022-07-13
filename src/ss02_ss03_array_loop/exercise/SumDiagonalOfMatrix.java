package ss2_ArrayLoop.exercise;

import java.util.Scanner;

public class SumDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận vuông: ");
        int size = input.nextInt();
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("matrix[%d][%d]", i, j);
                matrix[i][j] = input.nextDouble();
            }
        }

        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tổng các sổ ở đường chéo trong ma trận là: " + sum);
    }
}
