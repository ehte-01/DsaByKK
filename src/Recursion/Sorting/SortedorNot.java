package Recursion.Sorting;

import java.util.Scanner;

public class SortedorNot {

    static boolean sort(int [] arr,int index) {

        if(index == arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sort(arr,index+1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array: ");
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sort(arr,0));
    }

}
