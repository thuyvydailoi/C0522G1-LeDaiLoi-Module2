package demo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr= {-1, 150, 190, 170, -1, -1, 160, 180};
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==-1){
                continue;
            }
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]==-1){
                    continue;
                }
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
