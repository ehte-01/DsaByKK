package Recursion.Sorting;
import java.util.Arrays;
public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSort(arr, s, mid);   // left
        mergeSort(arr, mid, e);   // right

        merge(arr, s, mid, e);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;     // pointer left part
        int j = m;     // pointer right part
        int k = 0;     // pointer for mix[]

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < m) {
            mix[k++] = arr[i++];
        }

        while (j < e) {
            mix[k++] = arr[j++];
        }

        // Copy mix[] back into original array
        for (int x = 0; x < mix.length; x++) {
            arr[s + x] = mix[x];
        }
    }
}


