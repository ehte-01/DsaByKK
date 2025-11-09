package Recursion;

import java.util.Scanner;

public class LinearSearch {
     static boolean search(int[] arr, int target, int index){

          if(index== arr.length){
               return false;
          }

          if(arr[index]==target){
               return true;
          }
          return (search(arr,target,index+1));
     }

     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the array:");
          int n=sc.nextInt();
          int[] arr=new int[n];
          System.out.println("Enter the array elements:");
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          System.out.println("Enter the target:");
          int target=sc.nextInt();
          System.out.println(search(arr,target,0));
     }
}
