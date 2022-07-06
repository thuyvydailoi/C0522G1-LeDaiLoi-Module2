package ss2_ArrayLoop.exercise;


import java.util.Scanner;

public class MaxofArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int row = input.nextInt();
        System.out.println("Nhập số cột: ");
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập matrix[%d][%d]: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }

        int max = matrix[0][0];
        System.out.println("Ma trận vừa tạo: ");
        for (int[] rowMatrix : matrix) {
            for (int colMatrix : rowMatrix) {
                System.out.print(colMatrix + " ");
                if (colMatrix > max) {
                    max = colMatrix;
                }
            }
            System.out.println();
        }

        System.out.println("Phần tử lớn nhất trong ma trận: ");
        System.out.println(max);
    }


}
