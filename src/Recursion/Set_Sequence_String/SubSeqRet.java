package Recursion.Set_Sequence_String;

import java.util.ArrayList;

public class SubSeqRet {
    public static void main(String[] args) {
        System.out.println(subseqret("","abc"));
    }

    static ArrayList<String> subseqret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> left= subseqret(p+ch,up.substring(1));
        ArrayList<String> right= subseqret(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
