package ss14_sort_algorithms.practice;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currntMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currntMinIndex = j;
                }
            }

            if (currntMinIndex != i){
                list[currntMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i< list.length;i++){
            System.out.print(list[i] + " ");
        }
    }
}
