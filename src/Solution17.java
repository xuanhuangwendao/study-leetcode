import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    public List<String> letterCombinations(String digits) {
        Map<String, List<String>> numberMapping = new HashMap<>();
        char now = 'a';
        for (int i = 2; i <= 9; i++) {
            List<String> chars = new ArrayList<>();
            for (int j = 0; j < (i == 7 || i == 9 ? 4 : 3); j++) {
                chars.add(String.valueOf(now));
                now++;

            }
            numberMapping.put(String.valueOf(i), chars);
        }


        List<String> tmp = new ArrayList<>();
        List<String> ret = new ArrayList<>();
        tmp.add("");
        for (int i = 0; i < digits.length(); i++) {
            ret.clear();
            String digit = String.valueOf(digits.charAt(i));
            List<String> charList = numberMapping.get(digit);
            for (String c : charList) {
                for (String s : tmp) {
                    ret.add(s + c);
                }
            }
            tmp.clear();
            tmp.addAll(ret);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        solution17.letterCombinations("23");
    }
}
