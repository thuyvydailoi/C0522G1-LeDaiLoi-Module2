package demo;

public class SumTwoString {
    public static void main(String[] args) {
        String str1 = "11:20:30";
        String str2 = "07:35:45";

        String[] arr1 = str1.split(":");
        String[] arr2 = str2.split(":");

        int sec1 = Integer.parseInt(arr1[0]) * 3600 + Integer.parseInt(arr1[1]) * 60 + Integer.parseInt(arr1[2]);
        int sec2 = Integer.parseInt(arr2[0]) * 3600 + Integer.parseInt(arr2[1]) * 60 + Integer.parseInt(arr2[2]);

        int sum = sec1 + sec2;

        int h = sum / 3600;
        int m = sum % 3600 / 60;
        int s = sum - h * 3600 - m * 60;

        String result = "" + h + ":" + m + ":" + s;
        System.out.println("Kết quả: " + result);
    }
}
