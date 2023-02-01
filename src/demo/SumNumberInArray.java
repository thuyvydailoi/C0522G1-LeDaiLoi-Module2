package demo;

public class SumNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,4,3,2,6,7,9,8,2,4,6};
        int num = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(i + "&" + j + " (" + arr[i] + " + " + arr[j] + " = " + num + ")");
                }
            }
        }
    }
}
