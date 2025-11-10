package Recursion.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
     static boolean search(int[] arr, int target, int index) {

          if (index == arr.length) {
               return false;
          }

          if (arr[index] == target) {
               return true;
          }
          return (search(arr, target, index + 1));
     }

     static int findIndex(int[] arr, int target, int index) {
          if (index == arr.length) {
               return -1;
          }
          if (arr[index] == target) {
               return index;
          }
          return (findIndex(arr, target, index + 1));
     }

     static int findLastIndex(int[] arr, int target, int index) {
          if (index == -1) {
               return -1;
          }
          if (arr[index] == target) {
               return index;
          }
          return (findLastIndex(arr, target, index - 1));
     }

     static ArrayList<Integer> list = new ArrayList<>();

     static void findAllIndex(int[] arr, int target, int index) {
          if (index == arr.length) {
               return;
          }
          if (arr[index] == target) {
               list.add(index);
          }
          findAllIndex(arr, target, index + 1);
     }

     static ArrayList<Integer> findAllIndexWithList(int[] arr, int target, int index, ArrayList<Integer> list) {
          if (index == arr.length) {
               return list;
          }
          if (arr[index] == target) {
               list.add(index);
          }
          return findAllIndexWithList(arr, target, index + 1, list);
     }

     static ArrayList<Integer> findAllIndexWithList2(int[] arr, int target, int index) {

          ArrayList<Integer> list = new ArrayList<>();

          if (index == arr.length) {
               return list;
          }

          if (arr[index] == target) {
               list.add(index);
          }
          ArrayList<Integer> ansFromBelowCalls = findAllIndexWithList2(arr, target, index + 1);
          list.addAll(ansFromBelowCalls);
          return list;
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
          System.out.println(findIndex(arr,target,0));
          System.out.println(findLastIndex(arr,target,arr.length-1));
          findAllIndex(arr,target,0);
          System.out.println(list);
          System.out.println(findAllIndexWithList(arr,target,0, new ArrayList<>()));
          System.out.println(findAllIndexWithList2(arr,target,0));
     }
}
