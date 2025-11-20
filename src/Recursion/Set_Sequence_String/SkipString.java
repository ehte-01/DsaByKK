package Recursion.Set_Sequence_String;

public class SkipString {
    public static void main(String[] args) {
        String s = "bapplecdappleef";
        System.out.println(skipString("", s, "apple"));
    }

    static String skipString(String p, String up, String target) {
        if (up.isEmpty()) return p;
        if (up.startsWith(target)) {
            return skipString(p, up.substring(target.length()), target);
        } else {
            return skipString(p + up.charAt(0), up.substring(1), target);
        }
    }
}
