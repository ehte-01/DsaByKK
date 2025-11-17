package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int [] arr, int start, int end){
        if(start>=end)
            return;
        int pivotIndex=partition(arr,start,end);

        quickSort(arr,start,pivotIndex-1);
        quickSort(arr,pivotIndex+1,end);


    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i=start;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr={6,1,2,3,4,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
