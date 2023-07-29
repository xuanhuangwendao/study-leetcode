public class Solution8 {
    public int myAtoi(String s) {
        s = s.trim();
        boolean sign = true;
        if (s.length() == 0) {
            return 0;
        }
        if (s.startsWith("+")) {
            s = s.substring(1);
        } else if (s.startsWith("-")) {
            sign = false;
            s = s.substring(1);
        }
        long ret = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            int num = c - '0';
            ret = ret * 10 + num;
            if (ret > Integer.MAX_VALUE) {
                return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return sign ? (int) ret : (int) -ret;
    }

}
