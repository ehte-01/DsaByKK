package Recursion.Set_Sequence_String;
import java.util.*;

public class Subset {
    public List<List<Integer>> subsets(int[] arr) {
        return helper(arr, 0, new ArrayList<>());
    }

    private List<List<Integer>> helper(int[] arr, int i, List<Integer> current) {
        if (i == arr.length) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(current));
            return list;
        }

        List<Integer> copy = new ArrayList<>(current);
        List<List<Integer>> left = helper(arr, i + 1, copy);

        current.add(arr[i]);
        List<List<Integer>> right = helper(arr, i + 1, current);

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        Subset obj = new Subset();
        int[] arr = {1, 2, 3};
        System.out.println(obj.subsets(arr));
    }
}





