package Recursion.Set_Sequence_String;

public class SkipChar {
    public static void main(String[] args) {
        skip("", "bakra", 'a');
    }

    static void skip(String processed, String unprocessed, char target) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == target) {
            skip(processed, unprocessed.substring(1), target);
        } else {
            skip(processed + ch, unprocessed.substring(1), target);
        }
    }
}

