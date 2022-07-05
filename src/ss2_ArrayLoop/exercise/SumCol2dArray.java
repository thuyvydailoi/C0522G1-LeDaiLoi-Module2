package ss2_ArrayLoop.exercise;

import java.util.Scanner;

public class SumCol2dArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int row = scanner.nextInt();

        double[][] array2d = new double[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("Nhập matrix[%d][%d]: ", i, j);
                array2d[i][j] = scanner.nextDouble();
            }
        }

        int index;
        boolean isNotIndex;
        do {
            System.out.println("Nhập cột cần tính tổng: ");
            index = scanner.nextInt();
            isNotIndex = index < 0 || index > row - 1;
            if (isNotIndex) {
                System.out.println("Nhập lại cột cần tính tổng: ");
            }
        } while (isNotIndex);

        double sum = 0;
        System.out.println("Các phần tử trong cột cần tính tổng: ");
        for (double[] element : array2d) {
            System.out.println(element[index]);
            sum += element[index];
        }
        System.out.printf("Tổng các phần tử trong cột %d là:%10.2f", index, sum);
    }
}
