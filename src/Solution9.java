public class Solution9 {

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.contentEquals(sb);
    }
}
