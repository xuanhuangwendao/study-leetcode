import java.util.HashSet;
import java.util.Set;

public class Solution1805 {
    public int numDifferentIntegers(String word) {
        Set<String> numSet = new HashSet<>();
        int left = 0;
        int right = 0;
        for (; left < word.length(); left++) {
            char c = word.charAt(left);
            if (c >= '0' && c <= '9') {
                for(right = left + 1; right< word.length(); right++) {
                    char d = word.charAt(right);
                    if (d >= '0' && d <= '9') {

                    } else {
                        break;
                    }
                }
                String s = word.substring(left, right);
                while (s.startsWith("0")) {
                    s = s.substring(1);
                }
                numSet.add(s);
                left = right;

            }
        }
        return numSet.size();
    }

    public static void main(String[] args) {
        Solution1805 solution1805 = new Solution1805();
        solution1805.numDifferentIntegers("a123bc34d8ef34");
    }
}
