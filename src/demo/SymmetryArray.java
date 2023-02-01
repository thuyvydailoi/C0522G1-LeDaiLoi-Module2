package demo;

public class SymmetryArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 1, 1};
        boolean check = false;

        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length - 1]) {
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Đây là mảng đổi xứng!");
        } else {
            System.out.println("Đây không phải là mảng đối xứng!");
        }
    }
}


//    int[] arr = {1, 1, 3, 1, 1};
//    boolean check = false;
//
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//        if (arr[i] != arr[j]) {
//        check = true;
//        break;
//        }
//        }
//        if (!check) {
//        System.out.println("Đây là mảng đổi xứng!");
//        } else {
//        System.out.println("Đây không phải là mảng đối xứng!");
//        }
//        }

//        for (int i = 0; i < arr.length -1; i++){
//            for (int j= i +1)
//        }
//        for (int i = 0; i < arr.length / 2; i++) {
//
//            if (arr[i] != arr[arr.length - i - 1]) {
//                check = false;
//                break;
//            }
//        }
//        if (!check) {
//            System.out.println("Đây là mảng đổi xứng!");
//        } else {
//            System.out.println("Đây không phải là mảng đối xứng!");
//        }
//    }
//}
