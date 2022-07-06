package ss4_Oop.exercise.StopWatch;

public class MainStopWatch {
    public static void main(String[] args) {

        long[] arrayA = new long[100000000];
        for (int i = 1; i < arrayA.length; i++) {
            arrayA[i] = Math.round(Math.random() * 100000000000000l);
        }
        StopWatch stopWatch = new StopWatch();
        quickSort(arrayA,0, arrayA.length-1);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

    public static long[] quickSort(long[] arr, int l, int r) {
        if (l >= r) {
            return arr;
        }

        int mid = (l + r) / 2;
        long temp = arr[mid];
        int i = l;
        int j = r;

        do {
            while (arr[i] < temp) {
                i++;
            }
            while (arr[j] > temp) {
                j--;
            }
            if (i <= j) {
                long t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        } while (i <= j);
        if (l < j) {
            return quickSort(arr, l, j);
        }
        if (r > i) {
            return quickSort(arr, i, r);
        }
        return arr;
    }


}
